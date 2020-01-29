/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.dao;

import ec.edu.espe.distribuidas.enums.EstadoActivoInactivoEnum;
import ec.edu.espe.distribuidas.model.Modulo;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author Dennys
 */
@LocalBean
@Stateless
public class ModuloDAO extends AbstractDAO<Modulo> {

    public ModuloDAO() {
        super(Modulo.class);
    }

    /**
     * Metodo Finder que obtiene un listado de modulos en base al estado.
     *
     * @param estado El estado del modulo con el que se va a realizar la
     * busqueda.
     * @return Listado de modulos en base al estado.
     */
    public List<Modulo> findByEstado(EstadoActivoInactivoEnum estado) {
        return this.finder(
                "SELECT m FROM Modulo m WHERE m.codigo=?1",
                new Object[]{
                    estado
                }
        );
    }

    /**
     * Metodo Finder que obtiene un modulo en base al nombre.
     *
     * @param nombre El nombre del modulo que se va a buscar.
     * @return Un modulo en base al nombre.
     */
    public Modulo findByNombre(String nombre) {
        return this.finder(
                "SELECT m FROM Modulo m WHERE m.nombre = ?1",
                new Object[]{
                    nombre
                }
        ).get(0);
    }

}