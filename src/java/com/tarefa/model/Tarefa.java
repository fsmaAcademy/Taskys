/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.model;


import com.tarefa.DAO.ItemDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Tarefa {
    
    private Integer id;
    private Double prioridade;
    private String nome;
    private LocalDate dataLimite;
    private Double porcentual = new Double(0);
    private String detalhe;
    private boolean aberto = true;
    private List<Item> itens;
    
    
    public Tarefa() {
        this.itens = new ArrayList<>();
    }
    
    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public boolean isAberto() {
        return aberto;
    }
    
    public boolean isNotAberto() {
        return !this.isAberto();
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    
    public Double getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Double prioridade) {
        if (prioridade >= 0 && prioridade <= 10) {
            this.prioridade = prioridade;        
        } else {
            System.out.println("Número não permitido");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Double getPorcentual() {
        return this.calculaPorcentual();
    }
    
    private Double calculaPorcentual() {
        this.porcentual = (new Double(100) * this.quantidadeTotalDeTarefasConcluidas()) / this.quantidadeTotalDeTarefas();    
        return this.porcentual;
    }
    
    private Integer quantidadeTotalDeTarefas() {
        ItemDAO itemDao = new ItemDAO();
        Integer quantidadeDeItens = itemDao.getListaDaTarefa(this.id).size();
        return quantidadeDeItens;
    }
    
    private Integer quantidadeTotalDeTarefasConcluidas() {
        ItemDAO itemDao = new ItemDAO();
        Integer quantidadeDeItensConcluidos = itemDao.getListaDaTarefaConcluida(this.id).size();
        return quantidadeDeItensConcluidos;
    }

    public void setPorcentual(Double porcentual) {
        this.porcentual = porcentual;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarefa other = (Tarefa) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
