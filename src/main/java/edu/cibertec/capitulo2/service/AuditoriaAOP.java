/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.capitulo2.service;

import org.aspectj.lang.JoinPoint;

/**
 *
 * @author Adminfoco
 */
public class AuditoriaAOP {
    
    public void antesAdvice(JoinPoint jp){
        System.out.println("Auditoria ANTES del metodo: "+jp.getSignature());
    }
    public void despuesAdvice(JoinPoint jp){
        System.out.println("Auditoria DESPUES del metodo: "+jp.getSignature());
    }
    public void despuesExcepcion(JoinPoint jp){
        System.out.println("Auditoria DESPUES de la excepcion: "+jp.getSignature());
    }
    
}
