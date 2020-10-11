/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IGrupoDeportivo;
import java.util.List;
import modelo.GrupoDeportivo;
import org.hibernate.Session;
import util.SessionManagement;

/**
 *
 * @author migue
 */
public class GrupoDeportivoDao implements IGrupoDeportivo{

    @Override
    public void guardarGrupoDeportivo(GrupoDeportivo grupoDeportivo) {
        SessionManagement.guardar(grupoDeportivo);
    }

    @Override
    public GrupoDeportivo obtenerGrupoDeportivo(Integer id) {
        Session session = SessionManagement.getSessionHibernate();
        GrupoDeportivo grupoDeportivo = (GrupoDeportivo) session.get(GrupoDeportivo.class, id);
        System.out.println(grupoDeportivo);
        session.close();
        return grupoDeportivo;
    }

    @Override
    public void actualizarGrupoDeportivo(GrupoDeportivo grupoDeportivo) {
        SessionManagement.actualizar(grupoDeportivo);
    }

    @Override
    public void eliminarGrupoDeportivo(GrupoDeportivo grupoDeportivo) {
        SessionManagement.eliminar(grupoDeportivo);
    }

    @Override
    public List<GrupoDeportivo> obtenerGrupoDeportivos() {
        Session session = SessionManagement.getSessionHibernate();
        List<GrupoDeportivo> grupoDeportivo = session.createQuery("from GrupoDeportivo").list();
        session.close();
        return grupoDeportivo;
    }

    
}
