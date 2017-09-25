/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.DAO;

/**
 *
 * @author thiago
 */
class Sequence {
    private static Integer id = new Integer(0);

    public static Integer getId() {
        ++id;
        return id;
    }
}
