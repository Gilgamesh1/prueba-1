/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_login.dao;

import java.util.List;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ryv.app.hibernate.modelo.EjmVO;

/**
 *
 * @author Raúl
 */
@Repository
public class LoginImplDAO implements LoginDAO {//extends BaseImplDAO 
    
    private final Logger log = Logger.getLogger(LoginImplDAO.class);
    @Autowired
    SessionFactory sessionFactory;
    
    
    @Override
    public List obtenerRegistrosLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void crearLogin(EjmVO entity) {
        log.debug("Inicio");
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
        log.debug("Fin");
    }
    
}
