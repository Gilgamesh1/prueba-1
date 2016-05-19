/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_login;

import java.text.SimpleDateFormat;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ryv.app.negocio.cu_login.dao.LoginImplDAO;
import ryv.app.negocio.cu_login.dto.LoginDTO;

/**
 *
 * @author Raúl
 */
@Service
public class LoginImpl implements Login {

    private static final Logger log = Logger.getLogger(LoginImpl.class);
//    @Autowired
//    private LoginImplDAO dao;

    @Override
    public void insertar(LoginDTO dto) {
        log.debug("Inicio");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        log.debug(dto.getIdentificador());
        log.debug(dto.getEntero());
        log.debug(dto.getDecimal());
        log.debug(dto.getTexto());
        log.debug(sdf.format(dto.getFecha()));
        log.debug(sdf.format(dto.getTiempo()));
        log.debug(dto.getTimeStamp());
        log.debug("Fin");
    }

    @Override
    public void actualizar(LoginDTO dto) {
        log.debug("Inicio");
        log.debug("Fin");
    }

    @Override
    public LoginDTO buscarTodos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LoginDTO> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}