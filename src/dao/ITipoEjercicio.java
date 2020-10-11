/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.TipoEjercicio;

/**
 *
 * @author migue
 */
public interface ITipoEjercicio {
    
    public void guardarTipoEjercicio(TipoEjercicio tipoEjercicio);
    public TipoEjercicio ObtenerTipoEjercicio(short id);
    public void actualizarTipoEjercicio(TipoEjercicio tipoEjercicio);
    public void eliminarTipoEjercicio(TipoEjercicio tipoEjercicio);
    public List<TipoEjercicio> listarTiposEjercicio();
}
