/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.web;

import ec.edu.espe.distribuidas.model.Modulo;
import ec.edu.espe.distribuidas.service.ModuloService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ViewScoped
public class ModuloBean implements Serializable {

    
    @Inject
    private ModuloService moduloService;
    
    private List<Modulo> modulos;
    private Modulo modulo;


    
     @PostConstruct
    public void init(){
    modulos=new ArrayList<>();
    modulos=moduloService.obtenerTodos();
    }

    public ModuloService getModuloService() {
        return moduloService;
    }

    public void setModuloService(ModuloService moduloService) {
        this.moduloService = moduloService;
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(List<Modulo> modulos) {
        this.modulos = modulos;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    
    

    
}
