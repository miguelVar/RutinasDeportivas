/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IRegistro;
import java.util.List;
import modelo.Registro;
import org.hibernate.Session;
import util.SessionManagement;

/**
 *
 * @author migue
 */
public class RegistroDao implements IRegistro{

    @Override
    public void guardarRegistro(Registro registro) {
        SessionManagement.guardar(registro);
    }

    @Override
    public Registro obtenerRegistro(Integer id) {
       Session session = SessionManagement.getSessionHibernate();
        Registro registro = (Registro) session.get(Registro.class, id);
        System.out.println(registro);
        session.close();
        return registro; 
    }

    @Override
    public void actualizarRegistro(Registro registro) {
        SessionManagement.actualizar(registro);
    }

    @Override
    public void eliminarRegistro(Registro registro) {
        SessionManagement.eliminar(registro);
    }

    @Override
    public List<Registro> obtenerRegistro() {
        
        Session session = SessionManagement.getSessionHibernate();
        List<Registro> registros = session.createQuery("from Registro").list();
        session.close();
        return registros;
    }

    
}
