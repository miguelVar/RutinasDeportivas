/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ITipoEjercicio;
import java.util.List;
import modelo.TipoEjercicio;
import org.hibernate.Session;
import util.SessionManagement;

/**
 *
 * @author migue
 */
public class TipoEjercicioDao implements ITipoEjercicio{

    @Override
    public void guardarTipoEjercicio(TipoEjercicio tipoEjercicio) {
        SessionManagement.guardar(tipoEjercicio);
    }

    @Override
    public TipoEjercicio ObtenerTipoEjercicio(short id) {
        Session session = SessionManagement.getSessionHibernate();
        TipoEjercicio tipoEjercicio = (TipoEjercicio) session.get(TipoEjercicio.class, id);
        System.out.println(tipoEjercicio);
        session.close();
        return tipoEjercicio;
    }

    @Override
    public void actualizarTipoEjercicio(TipoEjercicio tipoEjercicio) {
        SessionManagement.actualizar(tipoEjercicio);
    }

    @Override
    public void eliminarTipoEjercicio(TipoEjercicio tipoEjercicio) {
        SessionManagement.eliminar(tipoEjercicio);
    }

    @Override
    public List<TipoEjercicio> listarTiposEjercicio() {
        Session session = SessionManagement.getSessionHibernate();
        List<TipoEjercicio> tipoEjercicio = session.createQuery("from TipoEjercicio").list();
        session.close();
        return tipoEjercicio;
    }
    
}
