/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.DAO;

import java.util.List;

/**
 *
 * @author aluno
 */
public interface Dados {
    
    public void gravar(Object obj) throws Exception;
    public void excluir(Object obj) throws Exception;
    public List getList();
    
}
