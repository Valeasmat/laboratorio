/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.capitulo2.beans;

import edu.cibertec.capitulo2.Imprimible;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 *
 * @author Adminfoco
 */
//@Component
@Qualifier("documentoExcelBeanAnnotation")
public class DocumentoExcel implements Imprimible{

    public void iniciar(){
        System.out.println("Iniciando la construccion del bean");
    }
    
    public void destruir(){
        System.out.println("Destruyendo la instancia creada");
    }
    
    @Override
    public String imprimir() {
        String abc=null;
        //abc.substring(5);
        return "Imprimiendo desde un archivo Excel";
    }
    
    
}
