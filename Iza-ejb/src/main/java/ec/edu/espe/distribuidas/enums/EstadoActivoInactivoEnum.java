/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.enums;

public enum EstadoActivoInactivoEnum {
    /** Representa al valor Activo. */
    ACT("Activo"),
    /** Representa al valor Inactivo. */
    INA("Inactivo");    
    
    /**
     * Propiedad que contiene el texto asociado del elemento.
     */
    private final String text;

    private EstadoActivoInactivoEnum(String text) {
        this.text = text;
    }

    /**
     * Retorna el texto asociadado al elemento de la enumeraci\u00F3n.
     *
     * @return Texto asociado al elemento de la enumeraci\u00F3n.
     */
    public String getText() {
        return this.text;
    }
}