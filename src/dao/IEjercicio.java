/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Ejercicio;

/**
 *
 * @author migue
 */
public interface IEjercicio {
    
    public void guardarEjercicio(Ejercicio ejercicio);
    public Ejercicio obtenerEjercicio(Integer id);
    public void actualizarEjercicio(Ejercicio ejercicio);
    public void eliminarEjercicio(Ejercicio ejercicio);
    public List<Ejercicio> obtenerEjercicios();
}
