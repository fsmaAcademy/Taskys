/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.controller;

import com.tarefa.DAO.ItemDAO;
import com.tarefa.DAO.TarefaDAO;
import com.tarefa.model.Item;
import com.tarefa.model.Tarefa;
import java.time.LocalDate;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author thiago
 */
@ManagedBean
@SessionScoped
public class itemBean {
    
    private Item item;
    private Tarefa tarefa;
    private ItemDAO itemDao;
    private TarefaDAO tarefaDao;
    private boolean incluindo;
    
    /**
     * Creates a new instance of itemBean
     */
    public itemBean() {
        this.itemDao = new ItemDAO();
        this.tarefaDao = new TarefaDAO();
    }
    
    public String solicitaIncluir(Tarefa tarefa) {
        this.incluindo = true;
        this.item = new Item();
        this.tarefa = tarefa;
        return "adicionarItem?faces-redirect=true";
    }
    
    public String incluir() {   
        if(this.incluindo) {
            this.item.setIdTarefa(this.tarefa.getId());
            this.itemDao.incluir(this.item);
            this.tarefa.adicionarItem(this.item);
            this.tarefaDao.alterar(this.tarefa);
        }
        return "listaDeTarefas?faces-redirect=true";
    }
    
    public String solicitaAlterar(Item item) {
        this.incluindo = false;
        this.item = item;
        return "adicionarItem?faces-redirect=true";
    }
    
    public String alterar() {
       this.itemDao.alterar(this.item);
       return null;
    }
    
    public String excluir(Item item) {
        this.itemDao.excluir(item);
        return null;
    }
    
    public String iniciarItem(Item item, Tarefa tarefa) {
        this.item = item;
        this.tarefa = tarefa;
        
        this.item.setDataExecucao(LocalDate.now());
        
        this.itemDao.alterar(this.item);
        this.tarefaDao.alterar(tarefa);
        return null;
    }
    
    public List<Item> getItens(Integer idTarefa) {
        return this.itemDao.getListaDaTarefa(idTarefa);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
}
