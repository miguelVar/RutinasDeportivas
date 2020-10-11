/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.IParteCuerpo;
import java.util.List;
import modelo.ParteCuerpo;
import org.hibernate.Session;
import util.SessionManagement;

/**
 *
 * @author migue
 */
public class ParteCuerpoDao implements IParteCuerpo {

    @Override
    public void guardarParteCuerpo(ParteCuerpo parteCuerpo) {
        SessionManagement.guardar(parteCuerpo);
    }

    @Override
    public ParteCuerpo obtenerParteCuerpo(Integer id) {
        try {
            Session session = SessionManagement.getSessionHibernate();
            ParteCuerpo parteCuerpo = (ParteCuerpo) session.get(ParteCuerpo.class, id);
            System.out.println(parteCuerpo);
            session.close();
            return parteCuerpo;

        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public void actualizarParteCuerpo(ParteCuerpo parteCuerpo) {
        SessionManagement.actualizar(parteCuerpo);
    }

    @Override
    public void eliminarParteCuerpo(ParteCuerpo parteCuerpo) {
        SessionManagement.eliminar(parteCuerpo);
    }

    @Override
    public List<ParteCuerpo> obtenerParteCuerpo() {
        Session session = SessionManagement.getSessionHibernate();
        List<ParteCuerpo> partesCuerpo = session.createQuery("from ParteCuerpo").list();
        session.close();
        return partesCuerpo;
    }

}
