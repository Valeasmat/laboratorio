/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.capitulo2.service;

import edu.cibertec.capitulo2.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adminfoco
 */
@Service
public class ImpresoraService {
    
    @Autowired
    @Qualifier("documentoExcelBeanAnnotation")
    private Imprimible documento;

    public ImpresoraService(Imprimible documento) {
        this.documento = documento;
    }

    public ImpresoraService() {}

    public Imprimible getDocumento() {
        return documento;
    }

    public void setDocumento(Imprimible documento) {
        this.documento = documento;
    }
    
    public void imprimirDocumento(){
        System.out.println(documento.imprimir());
    }
}
