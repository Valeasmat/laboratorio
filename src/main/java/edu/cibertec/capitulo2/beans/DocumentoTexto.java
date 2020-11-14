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
@Qualifier("documentoTextoBeanAnnotation")
public class DocumentoTexto implements Imprimible{

    public void iniciar(){
        System.out.println("Iniciando la construccion del bean texto");
    }
    
    public void destruir(){
        System.out.println("Destruyendo la instancia creada texto");
    }
    
    @Override
    public String imprimir() {
        return "Imprimiento desde un archivo de Texto!";
    }
    
}
