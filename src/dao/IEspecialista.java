/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Especialista;

/**
 *
 * @author migue
 */
public interface IEspecialista {
    
    public void guardarEspecialista(Especialista especialista);
    public Especialista obtenerEspecialista(Integer id);
    public void actualizarEspecialista(Especialista especialista);
    public void eliminarEspecialista(Especialista especialista);
    public List<Especialista> obtenerEspecialistas();
}
