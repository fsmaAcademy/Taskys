/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarefa.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author thiago
 */
@ManagedBean
@SessionScoped
public class templateBean {

    /**
     * Creates a new instance of templateBean
     */
    public templateBean() {
    }
    
    public String index() {
        return "index";
    }
    
}
