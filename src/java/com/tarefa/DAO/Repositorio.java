/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.DAO;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiago
 */
public abstract class Repositorio<T> {

    private List<T> lista = null;

    public Repositorio(List<T> lista) {
        this.lista = lista;
    }

    public abstract void setKey(T t);

    public void incluir(T t) {
        setKey(t);
        this.lista.add(t);
    }

    public void alterar(T t) {
        lista.remove(t);
        lista.add(t);
    }

    public void excluir(T t) {
        this.lista.remove(t);
    }

    public List<T> getList() {
        return this.lista;
    }

    public void setLista(List<T> lista) {
        this.lista = lista;
    }
}
