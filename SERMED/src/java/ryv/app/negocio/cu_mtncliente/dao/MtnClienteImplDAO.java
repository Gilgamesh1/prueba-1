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
     * @param page
     * @return List
     */
    @Override
    public List buscarClientes(String nombre, String nroDocumento, int page) {
        log.info("Info");
        List lst = null;
        try {
            Session s = sF.getCurrentSession();
            String hql = "select c.id,c.nombre,c.documento,c.nroDocumento,c.representanteLegal,c.telefono,c.celular,"
                    + "d.direccion,d.ubicacion from ClienteVO c inner join c.direcciones d";
            if (!nombre.isEmpty() || !nroDocumento.isEmpty()) {
                hql += " where";// c.id=d.cliente.id";
                if (!nombre.isEmpty()) {
                    hql += " upper(c.nombre) like '%" + nombre.toUpperCase() + "%'";
                }
                if (!nroDocumento.isEmpty()) {
                    hql += " upper(c.nroDocumento) like '%" + nroDocumento.toUpperCase() + "%'";
                }
            }
            hql += " order by c.id";
            Query query = s.createQuery(hql);
            query.setFirstResult((page - 1) * CONST_PAGE);
            query.setMaxResults(CONST_PAGE);
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
        long resultado = 0;
        try {
            Session s = sF.getCurrentSession();
            String hql = "select count(*) from ClienteVO c inner join c.direcciones d";
            if (!nombre.isEmpty() || !nroDocumento.isEmpty()) {
                hql += " where";//c.id=d.cliente.id";
                if (!nombre.isEmpty()) {
                    hql += " upper(nombre) like '%" + nombre.toUpperCase() + "%'";
                }
                if (!nroDocumento.isEmpty()) {
                    hql += " upper(nroDocumento) like '%" + nroDocumento.toUpperCase() + "%'";
                }
            }
            Query query = s.createQuery(hql);
            resultado = (long) query.list().get(0);
            log.info("Total de registro es: " + resultado);
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
