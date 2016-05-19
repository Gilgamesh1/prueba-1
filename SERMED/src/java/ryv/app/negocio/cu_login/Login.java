/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_login;

import java.util.List;
import ryv.app.negocio.cu_login.dto.LoginDTO;

/**
 *
 * @author Raúl
 */
public interface Login {

    public void insertar(LoginDTO dto);

    public void actualizar(LoginDTO dto);

    public LoginDTO buscarTodos(int id);

    public List<LoginDTO> buscarTodos();
}
