/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.hibernate;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Raúl
 */
@Repository
public class BaseImplDAO implements BaseDAO {

    private final Logger log = Logger.getLogger(BaseImplDAO.class);
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void insertar(Object entity) {
        log.debug("insertar");
        Session session = this.sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                log.warn("Falló al hacer un rollback", exc);
            }
        }
        log.debug("insertar");
    }

    @Override
    public void actualizar(Object entity) {
        log.debug("actualizar");
        Session session = this.sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                log.warn("Falló al hacer un rollback", exc);
            }
        }
        log.debug("actualizar");
    }

    /** Metodo para eliminar un registro de la base de datos
    * @param entity objeto para eliminar
    */
    @Override
    public void eliminar(Object entity) {
        log.debug("eliminar");
        Session session = this.sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            try {
                if (session.getTransaction().isActive()) {
                    session.getTransaction().rollback();
                }
            } catch (Exception exc) {
                log.warn("Falló al hacer un rollback", exc);
            }
        }
        log.debug("eliminar");
    }

    @Override
    public List findAll(Class clazz) {
        log.debug("findAll");
        Session session = this.sessionFactory.getCurrentSession();
        List list = session.createCriteria(clazz)
                .addOrder(Order.asc("id")).list();
        log.debug("findAll");
        return list;
    }

    /*Metodo para 
    *
    */
    @Override
    public Object getEntity(Class clazz, int id) {
        log.debug("getEntity");
        Object object = this.sessionFactory.getCurrentSession().get(clazz, id);
        log.debug("getEntity");
        return object;
    }

}
