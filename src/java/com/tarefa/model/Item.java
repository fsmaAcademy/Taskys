/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author aluno
 */
public class Item {
    
    private Integer id;
    private Integer idTarefa;
    private String descricao;
    private Double andamento;
    private LocalDate dataExecucao;
    private boolean concluido = false;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getAndamento() {
        return this.andamento;
    }

    public void setAndamento(Double andamento) {
        if (andamento < 0 || andamento >= 10) {
            this.andamento = andamento;        
        } else {
            this.andamento = null;
        }
    }

    public LocalDate getDataExecucao() {
        return this.dataExecucao;
    }

    public void setDataExecucao(LocalDate dataExecucao) {
        this.dataExecucao = dataExecucao;
    }

    public boolean getConcluido() {
        if (this.andamento.equals(new Double(100)))
            this.concluido = true;
        else
            return false;
        
        return this.concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdTarefa() {
        return this.idTarefa;
    }

    public void setIdTarefa(Integer idTarefa) {
        this.idTarefa = idTarefa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
}
