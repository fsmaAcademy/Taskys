/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.DAO;

import com.tarefa.model.Item;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiago
 * Usei uma classe genérica ao invés da implementação por interface!
 * Acho que facilita muito a minha vida na hora de deixar o sistema e as regras de negócios
 * mais particulares de uma classe livres.
 */
public class ItemDAO implements Dados {
    
    private static List<Item> itens = new ArrayList<Item>();
    
    @Override
    public void gravar(Object obj) throws Exception {
        Item item = (Item) obj;
        this.itens.add(item);
    }

    @Override
    public void excluir(Object obj) throws Exception {
        Item item = (Item) obj;
        this.itens.add(item);
    }

    @Override
    public List<Item> getList() {
        return this.itens;
    }
    
//    private Repositorio<Item> repositorio = new Repositorio<Item>(itens) {
//        
//        @Override
//        public void setKey(Item t) {
//            t.setId(Sequence.getId());
//        }
//        
//    };
//
//    public void incluir(Item t) {
//        repositorio.incluir(t);
//    }
//
//    public void alterar(Item t) {
//        repositorio.alterar(t);
//    }
//
//    public void excluir(Item t) {
//        repositorio.excluir(t);
//    }
//
//    public List<Item> getListaTodas() {
//        return repositorio.getList();
//    }
//    
//    public void excluiItensDaTarefa(Integer idTarefa) {
//               
//        for (Item item : this.itens) {
//            if(item.getIdTarefa().equals(idTarefa)) {
//                repositorio.excluir(item);
//            }
//        }
//    }
//    
//    public List<Item> getListaDaTarefa(Integer idTarefa) {
//        List<Item> itensDaTarefa = new ArrayList<Item>();
//        
//        for (Item item : this.itens) {
//            if(item.getIdTarefa().equals(idTarefa)) {
//                itensDaTarefa.add(item);
//            }
//        }
//        
//        return itensDaTarefa;
//    }
//    
//    public List<Item> getListaDaTarefaConcluida(Integer idTarefa) {
//        List<Item> itensDaTarefa = new ArrayList<Item>();
//        
//        for (Item item : this.itens) {
//            if(item.getIdTarefa().equals(idTarefa)) {
//                if (item.getConcluido() == true) {
//                    itensDaTarefa.add(item);                    
//                }
//            }
//        }
//        
//        return itensDaTarefa;
//    }

    
}
