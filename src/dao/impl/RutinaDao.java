/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IRutina;
import java.util.List;
import modelo.Rutina;
import modelo.RutinaId;
import org.hibernate.Session;
import util.SessionManagement;

/**
 *
 * @author migue
 */
public class RutinaDao implements IRutina {

    @Override
    public void guardarRutina(Rutina rutina) {
        SessionManagement.guardar(rutina);
    }

    @Override
    public Rutina ObtenerRutina(RutinaId id) {
        Session session = SessionManagement.getSessionHibernate();
        Rutina rutina = (Rutina) session.get(Rutina.class, id);
        System.out.println(rutina);
        session.close();
        return rutina;
    }

    @Override
    public void actualizarRutina(Rutina rutina) {
        SessionManagement.actualizar(rutina);
    }

    @Override
    public void eliminarRutina(Rutina rutina) {
        SessionManagement.eliminar(rutina);
    }

    @Override
    public List<Rutina> listarRutinas() {
        Session session = SessionManagement.getSessionHibernate();
        List<Rutina> rutina = session.createQuery("from Rutina").list();
        session.close();
        return rutina;
    }

}
