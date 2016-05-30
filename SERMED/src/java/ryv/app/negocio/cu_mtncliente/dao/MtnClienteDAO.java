/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_mtncliente.dao;

import java.util.List;
import ryv.app.hibernate.BaseDAO;

/**
 *
 * @author Raúl
 */
public interface MtnClienteDAO extends BaseDAO {

    public List buscarClientes(String nombre, String nrodocumento);
}
