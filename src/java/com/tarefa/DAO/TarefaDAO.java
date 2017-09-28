/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.DAO;

import com.tarefa.model.Tarefa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiago
 * Usei uma classe genérica ao invés da implementação por interface!
 * Acho que facilita muito a minha vida na hora de deixar o sistema e as regras de negócios
 * mais particulares de uma classe livres.
 */
public class TarefaDAO implements Dados {
    
    private static List<Tarefa> tarefas = new ArrayList<Tarefa>();

    @Override
    public void gravar(Object obj) throws Exception {
        Tarefa tarefa = (Tarefa) obj;
        this.tarefas.add(tarefa);
    }

    @Override
    public void excluir(Object obj) throws Exception {
        Tarefa tarefa = (Tarefa) obj;
        this.tarefas.add(tarefa);
    }

    @Override
    public List<Tarefa> getList() {
        return this.tarefas;
    }
    
    /**
     * Método para gerar uma sequencia de IDs.
     * Ótimo para relacionamentos!
     */
//    private Repositorio<Tarefa> repositorio = new Repositorio<Tarefa>(tarefas) {
//
//        @Override
//        public void setKey(Tarefa t) {
//            t.setId(Sequence.getId());
//        }
//        
//    };
//
//    public void incluir(Tarefa t) {
//        repositorio.incluir(t);
//    }
//    
//    public void alterar(Tarefa t) {
//        repositorio.alterar(t);
//    }
//
//    public void excluir(Tarefa t) {
//        repositorio.excluir(t);
//    }
//
//    public List<Tarefa> getListaTodas() {
//        return repositorio.getList();
//    }
//    
//    public List<Tarefa> getListaConcluidas() {
//        
//        List<Tarefa> tarefasConcluidas = new ArrayList<>();
//        
//        for (Tarefa tarefa : tarefas) {
//            if (tarefa.isNotAberto()) {
//                tarefasConcluidas.add(tarefa);
//            }
//        }
//        
//        return tarefasConcluidas;
//    }
//    
//    public List<Tarefa> getListaEmAndamento() {
//        
//        List<Tarefa> tarefasEmAndamento = new ArrayList<>();
//        
//        for (Tarefa tarefa : tarefas) {
//            if (tarefa.isAberto()) {
//                tarefasEmAndamento.add(tarefa);
//            }
//        }
//        
//        return tarefasEmAndamento;
//    }
    
}
