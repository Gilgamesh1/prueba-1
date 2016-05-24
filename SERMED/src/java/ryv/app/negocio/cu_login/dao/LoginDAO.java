/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_login.dao;

import java.util.List;
import ryv.app.hibernate.modelo.EjmVO;

/**
 *
 * @author Raúl
 */
public interface LoginDAO {

    public List obtenerRegistrosLogin();
    public void crearLogin(EjmVO entity);
}
