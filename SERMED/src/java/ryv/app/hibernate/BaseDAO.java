/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.hibernate;

import java.util.List;

/**
 *
 * @author Raúl
 */
public interface BaseDAO {
    
    static final int CONST_PAGE = 10;
    
    public void insertar(Object entity);

    public void actualizar(Object entity);

    public void eliminar(Object entity);

    public List findAll(Class clazz);
    
    public Object getEntity(Class clazz,int id);
}
