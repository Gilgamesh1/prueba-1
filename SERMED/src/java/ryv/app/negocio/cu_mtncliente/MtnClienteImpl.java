/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_mtncliente;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ryv.app.hibernate.modelo.ClienteVO;
import ryv.app.negocio.cu_mtncliente.dao.MtnClienteImplDAO;
import ryv.app.negocio.cu_mtncliente.dto.ClienteDTO;
import ryv.app.negocio.paginacion.PaginacionImpl;
import ryv.app.negocio.paginacion.dto.PaginacionDTO;

/**
 *
 * @author Raúl
 */
@Service
public class MtnClienteImpl implements MtnCliente {

    private final Logger log = Logger.getLogger(MtnClienteImpl.class);
    @Autowired
    private MtnClienteImplDAO dao;
    @Autowired
    private PaginacionImpl page;

    @Override
    public void agregarCliente(ClienteDTO dto) {
        log.info("Inicio");
        ClienteVO vo = new ClienteVO();
        vo.setNombre(dto.getNombre());
        vo.setDocumento(dto.getDocumento());
        vo.setNroDocumento(dto.getNroDocumento());
        vo.setRepresentanteLegal(dto.getRepresentante());
        vo.setTelefono(dto.getTelefono());
        vo.setCelular(dto.getCelular());
        dao.insertar(vo);
        log.info("Fin");
    }

    @Override
    public void actualizarCliente(ClienteDTO dto) {
        log.info("Inicio");
        ClienteVO vo = (ClienteVO) dao.getEntity(ClienteVO.class, dto.getId());
        vo.setNombre(dto.getNombre());
        vo.setDocumento(dto.getDocumento());
        vo.setNroDocumento(dto.getNroDocumento());
        vo.setRepresentanteLegal(dto.getRepresentante());
        vo.setTelefono(dto.getTelefono());
        vo.setCelular(dto.getCelular());
        dao.actualizar(vo);
        log.info("Fin");
    }

    @Override
    public List<ClienteDTO> buscarTodos() {
        log.info("Inicio");
        List<ClienteDTO> lst = new ArrayList<>();
        List<ClienteVO> lstVO = dao.findAll(ClienteVO.class);
        if (!lstVO.isEmpty()) {
            int nro = 1;
            for (ClienteVO vo : lstVO) {
                lst.add(new ClienteDTO(vo.getId(), nro, vo.getNombre(), vo.getDocumento() + "-" + vo.getNroDocumento(), vo.getRepresentanteLegal(), vo.getTelefono(), vo.getCelular()));
                nro++;
            }
        }
        log.info("Fin");
        return lst;
    }

    @Override
    public ClienteDTO obtenerCliente(int id) {
        log.info("Inicio");
        ClienteVO vo = (ClienteVO) dao.getEntity(ClienteVO.class, id);
        ClienteDTO dto = new ClienteDTO(vo.getId(), vo.getNombre(), vo.getDocumento(),
                vo.getNroDocumento(), vo.getRepresentanteLegal(), vo.getTelefono(), vo.getCelular());
        log.info("Fin");
        return dto;
    }

    @Override
    public List<ClienteDTO> obtenerClientes(String nombre, String nroDocumento) {
        log.info("Inicio");
        List<ClienteDTO> lst = new ArrayList<>();
        List<ClienteVO> lstVO = dao.buscarClientes(nombre, nroDocumento);
        if (!lstVO.isEmpty()) {
            int nro = 1;
            for (ClienteVO vo : lstVO) {
                lst.add(new ClienteDTO(vo.getId(), nro, vo.getNombre(), vo.getDocumento() + "-" + vo.getNroDocumento(), vo.getRepresentanteLegal(), vo.getTelefono(), vo.getCelular()));
                nro++;
            }
        }
        log.info("Fin");
        return lst;
    }

    @Override
    public PaginacionDTO paginacionClientes(String nombre, String nroDocumento) {
        log.info("Inicio");
        long total = dao.buscarTotalClientes(nombre, nroDocumento);
        PaginacionDTO dto = new PaginacionDTO();
        if (total != 0) {
            dto = this.page.calcular(total);
        }
        log.info("Fin");
        return dto;
    }

    @Override
    public PaginacionDTO paginacion(int val) {
        return this.page.calcular(val);
    }

    @Override
    public PaginacionDTO paginacionA(PaginacionDTO val) {
        return this.page.grupoAnterior(val);
    }

    @Override
    public PaginacionDTO paginacionS(PaginacionDTO val) {
        return this.page.grupoSiguiente(val);
    }

}
