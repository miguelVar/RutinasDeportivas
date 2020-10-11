/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IEjercicio;
import java.util.List;
import modelo.Ejercicio;
import org.hibernate.Session;
import util.SessionManagement;

/**
 *
 * @author migue
 */
public class EjercicioDao implements IEjercicio{

    @Override
    public void guardarEjercicio(Ejercicio ejercicio) {
        SessionManagement.guardar(ejercicio);
    }

    @Override
    public Ejercicio obtenerEjercicio(Integer id) {
        Session session = SessionManagement.getSessionHibernate();
        Ejercicio ejercicio = (Ejercicio) session.get(Ejercicio.class, id);
        session.close();
        return ejercicio;
    }

    @Override
    public void actualizarEjercicio(Ejercicio ejercicio) {
        SessionManagement.actualizar(ejercicio);
    }

    @Override
    public void eliminarEjercicio(Ejercicio ejercicio) {
        SessionManagement.eliminar(ejercicio);
    }

    @Override
    public List<Ejercicio> obtenerEjercicios() {
        Session session = SessionManagement.getSessionHibernate();
        List<Ejercicio> ejercicios = session.createQuery("from Ejercicio").list();
        System.out.println("tamaño: "+ejercicios.size());
        session.close();
        return ejercicios;
    }

    
}
