/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_login;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ryv.app.hibernate.modelo.EjmVO;
import ryv.app.negocio.cu_login.dao.LoginDAO;
import ryv.app.negocio.cu_login.dto.LoginDTO;

/**
 *
 * @author Raúl
 */
@Service
public class LoginImpl implements Login {

    private final Logger log = Logger.getLogger(LoginImpl.class);
    @Autowired
    private LoginDAO dao;

    @Override
    public void insertar(LoginDTO dto) {
        log.debug("Inicio");
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm");
        EjmVO entity = new EjmVO();
        entity.setNumero(dto.getEntero());
        entity.setDecimales(dto.getDecimal());
        entity.setTexto(dto.getTexto());
        try {
            entity.setFecha(sdfDate.parse(dto.getFecha()));
            entity.setTiempo(sdfTime.parse(dto.getTiempo()));
        } catch (ParseException e) {
            log.debug(e.getMessage());
            e.printStackTrace();
        }
        entity.setTimeStamp(new Date());
//        dao.crearLogin(entity);
        dao.insertar(entity);
        log.debug("Fin");
    }

    @Override
    public void actualizar(LoginDTO dto) {
        log.debug("Inicio");
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm");
        EjmVO ejmVO = (EjmVO) dao.getEntity(EjmVO.class, dto.getIdentificador());
        ejmVO.setNumero(dto.getEntero());
        ejmVO.setTexto(dto.getTexto());
        ejmVO.setDecimales(dto.getDecimal());
        ejmVO.setNumero(dto.getEntero());
        try {
            ejmVO.setFecha(sdfDate.parse(dto.getFecha()));
            ejmVO.setTiempo(sdfTime.parse(dto.getTiempo()));
        } catch (ParseException e) {
            log.debug(e.getMessage());
            e.printStackTrace();
        }
        ejmVO.setTimeStamp(new Date());
        dao.actualizar(ejmVO);
        log.debug("Fin");
    }

    @Override
    public void eliminar(LoginDTO dto) {
        log.debug("Inicio");
        EjmVO ejmVO = (EjmVO) dao.getEntity(EjmVO.class, dto.getIdentificador());
        dao.eliminar(ejmVO);
        log.debug("Fin");
    }

    @Override
    public LoginDTO buscarTodos(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<LoginDTO> buscarTodos() {
        log.debug("Inicio");
        List<EjmVO> lstEjmVO = (List<EjmVO>) dao.findAll(EjmVO.class);
        List<LoginDTO> lstLoginDTO = new ArrayList<LoginDTO>();
        if (!lstEjmVO.isEmpty()) {
            Iterator it = lstEjmVO.iterator();
            while (it.hasNext()) {
                EjmVO ejmVO = (EjmVO) it.next();
                LoginDTO loginDTO = new LoginDTO(ejmVO.getId(), ejmVO.getTexto(), ejmVO.getNumero(), ejmVO.getDecimales());
                SimpleDateFormat sdfDate = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm");
                SimpleDateFormat sdfTimeStamp = new SimpleDateFormat("dd/MM/yyyy hh:mm");
                loginDTO.setFecha(sdfDate.format(ejmVO.getFecha()));
                loginDTO.setTiempo(sdfTime.format(ejmVO.getTiempo()));
                loginDTO.setTimeStamp(sdfTimeStamp.format(ejmVO.getTimeStamp()));
                lstLoginDTO.add(loginDTO);
            }
        }
        log.debug("Fin");
        return lstLoginDTO;
    }

}
