/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.capitulo2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Adminfoco
 */
@Repository("holaMundoBean")
public class HolaMundo {
    @Value("HolaMundo desde anotaciones")
    private String saludo;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
}
