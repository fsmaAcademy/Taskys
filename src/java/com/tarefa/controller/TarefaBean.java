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
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author thiago
 */
@ManagedBean
@SessionScoped
public class TarefaBean {

    private final TarefaDAO tarefaDao;
    private Tarefa tarefa;

    private boolean incluindo;

    public TarefaBean() {
        this.tarefaDao = new TarefaDAO();
    }

    public String listaTarefas() {
        return "listaDeTarefas?faces-redirect=true";
    }

    public String listaTarefasConcluidas() {
        return "listaDeTarefasEncerradas?faces-redirect=true";
    }

    public String solicitaIncluir() {
        this.incluindo = true;
        this.tarefa = new Tarefa();
        return "novaTarefa?faces-redirect=true";
    }

    public String incluir() {
        if (this.incluindo) {
            this.tarefaDao.incluir(this.tarefa);
        }
        return "listaDeTarefas?faces-redirect=true";
    }
    
    public String solicitaAlterar(Tarefa tarefa) {
        this.incluindo = false;
        this.tarefa = tarefa;
        return "detalheDaTarefa?faces-redirect=true";
    }

    public String alterar() {
        this.tarefaDao.alterar(this.tarefa);
        return "listaDeTarefas?faces-redirect=true";
    }

    public String encerrar(Tarefa tarefa) {
        tarefa.setAberto(false);
        tarefaDao.alterar(tarefa);
        return null;
    }
    
    public String reabrir(Tarefa tarefa) {
        tarefa.setAberto(true);
        tarefaDao.alterar(tarefa);
        return null;
    }
    
    /**
     * 
     * @param tarefa
     * Minha dúvida é se a exclusão dos intens pode ser realizado aqui, ou precisa
     * ser instanciado dentro de itemBean?
     * @return 
     */
    public String excluir(Tarefa tarefa) {
        ItemDAO itemDao = new ItemDAO();
        itemDao.excluiItensDaTarefa(tarefa.getId());
        this.tarefaDao.excluir(tarefa);
        return null;
    }

    public Tarefa getTarefa() {
        return this.tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public List<Tarefa> getTarefas() {
        return this.tarefaDao.getListaTodas();
    }

    public List<Tarefa> getTarefasConcluidas() {
        return this.tarefaDao.getListaConcluidas();
    }
    
    public List<Tarefa> getTarefasEmAndamento() {
        return this.tarefaDao.getListaEmAndamento();
    }

}
