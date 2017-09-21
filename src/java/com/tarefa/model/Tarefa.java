/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Tarefa {
    
    private String nome;
    private Calendar dataLimite;
    private Double porcentual;
    private String detalhe;
    private Double prioridade;
    private List<Item> itens;

    public Tarefa() {
        this.itens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Calendar dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Double getPorcentual() {
        if (! (this.itens != null)) {
            this.porcentual = 100.0 / this.itens.size();
        }
        return this.porcentual;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Double getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Double prioridade) {
        this.prioridade = prioridade;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
    
}
