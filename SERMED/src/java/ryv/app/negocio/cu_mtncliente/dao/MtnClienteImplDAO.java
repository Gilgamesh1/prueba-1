/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_mtncliente.dao;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ryv.app.hibernate.BaseImplDAO;

/**
 *
 * @author Raúl
 */
@Repository
public class MtnClienteImplDAO extends BaseImplDAO implements MtnClienteDAO {

    private final Logger log = Logger.getLogger(MtnClienteImplDAO.class);
    @Autowired
    SessionFactory sF;

    /**
     * @param nombre
     * @param nroDocumento
     * @return List
     */
    @Override
    public List buscarClientes(String nombre, String nroDocumento) {
        log.info("Info");
        List lst = null;
        try {
            Session s = sF.getCurrentSession();
            String hql = "from ClienteVO ";
            if (!nombre.isEmpty() || !nroDocumento.isEmpty()) {
                hql += "where";
                if (!nombre.isEmpty()) {
                    hql += " upper(nombre) like '%" + nombre.toUpperCase() + "%'";
                }
                if (!nroDocumento.isEmpty()) {
                    hql += " upper(nroDocumento) like '%" + nroDocumento.toUpperCase() + "%'";
                }
            }
            Query query = s.createQuery(hql);
            lst = query.list();
        } catch (Exception e) {
            log.debug("Inicio de Error");
            e.printStackTrace();
            log.debug("Fin de Error");
        }
        log.info("Fin");
        return lst;
    }

    /**
     * @param nombre
     * @param nroDocumento
     * @return List
     */
    @Override
    public long buscarTotalClientes(String nombre, String nroDocumento) {
        log.info("Info");
        List lst = null;
        long resultado=0;
        try {
            Session s = sF.getCurrentSession();
            String hql = "select count(*) from ClienteVO ";
            if (!nombre.isEmpty() || !nroDocumento.isEmpty()) {
                hql += "where";
                if (!nombre.isEmpty()) {
                    hql += " upper(nombre) like '%" + nombre.toUpperCase() + "%'";
                }
                if (!nroDocumento.isEmpty()) {
                    hql += " upper(nroDocumento) like '%" + nroDocumento.toUpperCase() + "%'";
                }
            }
            Query query = s.createQuery(hql);
            resultado = (long) query.list().get(0);
        } catch (Exception e) {
            log.debug("Inicio de Error");
            log.debug(e.getMessage());
            e.printStackTrace();
            log.debug("Fin de Error");
        }
        log.info("Fin");
        return resultado;
    }
}
