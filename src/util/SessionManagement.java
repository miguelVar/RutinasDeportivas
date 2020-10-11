/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author migue
 */
public class SessionManagement {

    public static void guardar(Object object){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(object);
        transaction.commit();
        session.close();
    }
    public static void actualizar(Object object){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(object);
        transaction.commit();
        session.close();
    }
    public static void eliminar(Object object){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(object);
        transaction.commit();
        session.close();
    }
    
    public static Session getSessionHibernate(){
        return NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public static Session getCurretnSessionHibernate(){
        return NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
}
