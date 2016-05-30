/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_mtncliente;

import java.util.List;
import ryv.app.negocio.cu_mtncliente.dto.ClienteDTO;

/**
 *
 * @author Raúl
 */
public interface MtnCliente {

    public void agregarCliente(ClienteDTO dto);

    public void actualizarCliente(ClienteDTO dto);

    public List<ClienteDTO> buscarTodos();

    public ClienteDTO obtenerCliente(int id);
    
    public List<ClienteDTO> obtenerClientes(String nombre,String nroDocumento);
}
