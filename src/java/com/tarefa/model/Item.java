/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.model;

import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class Item {
    
    private String descricao;
    private Double andamento;
    private Calendar dataExecucao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getAndamento() {
        return andamento;
    }

    public void setAndamento(Double andamento) {
        this.andamento = andamento;
    }

    public Calendar getDataExecucao() {
        return dataExecucao;
    }

    public void setDataExecucao(Calendar dataExecucao) {
        this.dataExecucao = dataExecucao;
    }
    
    
}
