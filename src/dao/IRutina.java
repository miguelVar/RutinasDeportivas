/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import modelo.Rutina;
import modelo.RutinaId;
import modelo.TipoEjercicio;

/**
 *
 * @author migue
 */
public interface IRutina {
    
    public void guardarRutina(Rutina rutina);
    public Rutina ObtenerRutina(RutinaId  id);
    public void actualizarRutina(Rutina rutina);
    public void eliminarRutina(Rutina rutina);
    public List<Rutina> listarRutinas();
}
