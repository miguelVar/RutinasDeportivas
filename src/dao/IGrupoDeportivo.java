/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.GrupoDeportivo;

/**
 *
 * @author migue
 */
public interface IGrupoDeportivo {
    
    public void guardarGrupoDeportivo(GrupoDeportivo grupoDeportivo);
    public GrupoDeportivo obtenerGrupoDeportivo(Integer id);
    public void actualizarGrupoDeportivo(GrupoDeportivo grupoDeportivo);
    public void eliminarGrupoDeportivo(GrupoDeportivo grupoDeportivo);
    public List<GrupoDeportivo> obtenerGrupoDeportivos();
}
