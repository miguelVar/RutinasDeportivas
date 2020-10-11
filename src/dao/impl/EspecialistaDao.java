/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IEspecialista;
import java.util.List;
import modelo.Especialista;
import org.hibernate.Session;
import util.SessionManagement;

/**
 *
 * @author migue
 */
public class EspecialistaDao implements IEspecialista {

    @Override
    public void guardarEspecialista(Especialista especialista) {
        SessionManagement.guardar(especialista);
    }

    @Override
    public Especialista obtenerEspecialista(Integer id) {
        try {
            Session session = SessionManagement.getSessionHibernate();
            Especialista especialista = (Especialista) session.get(Especialista.class, id);
            session.close();
            return especialista;
        } catch (Exception e) {
            System.out.println("Especialista no encontrado");
        }
        return null;
    }

    @Override
    public void actualizarEspecialista(Especialista especialista) {
        SessionManagement.actualizar(especialista);
    }

    @Override
    public void eliminarEspecialista(Especialista especialista) {
        SessionManagement.eliminar(especialista);
    }

    @Override
    public List<Especialista> obtenerEspecialistas() {
        Session session = SessionManagement.getSessionHibernate();
        List<Especialista> especialistas = session.createQuery("from Especialista").list();
        session.close();
        return especialistas;
    }

}
