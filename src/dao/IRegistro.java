/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Registro;

/**
 *
 * @author migue
 */
public interface IRegistro {
    
    public void guardarRegistro(Registro registro);
    public Registro obtenerRegistro(Integer id);
    public void actualizarRegistro(Registro registro);
    public void eliminarRegistro(Registro registro);
    public List<Registro> obtenerRegistro();
}
