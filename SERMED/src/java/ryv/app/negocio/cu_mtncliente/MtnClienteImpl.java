/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_mtncliente;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static ryv.app.hibernate.BaseDAO.CONST_PAGE;
import ryv.app.hibernate.modelo.ClienteVO;
import ryv.app.hibernate.modelo.DireccionVO;
import ryv.app.negocio.cu_mtncliente.dao.MtnClienteImplDAO;
import ryv.app.negocio.cu_mtncliente.dto.ClienteDTO;
import ryv.app.negocio.cu_mtncliente.dto.DireccionDTO;

/**
 *
 * @author Raúl
 */
@Service
public class MtnClienteImpl implements MtnCliente {

    private final Logger log = Logger.getLogger(MtnClienteImpl.class);
    @Autowired
    private MtnClienteImplDAO dao;

    @Override
    public List<ClienteDTO> obtenerClientes(String nombre, String nroDocumento, int page) {
        log.info("Inicio - obtenerClientes");
        List<ClienteDTO> lst = new ArrayList<>();
        List<ClienteVO> lstVO = dao.buscarClientes(nombre, nroDocumento, page);
        if (!lstVO.isEmpty()) {
            int nro = ((page - 1) * CONST_PAGE) + 1;
            Iterator it = lstVO.iterator();
            while (it.hasNext()) {
                Object[] obj = (Object[]) it.next();
                log.info(obj[0]);
                log.info(obj[1]);
                ClienteDTO cliente = new ClienteDTO((int) obj[0], nro, (String) obj[1],
                        (String) obj[2] + "-" + (String) obj[3],
                        (String) obj[4], (String) obj[5], (String) obj[6]);
                cliente.setDir((String) obj[7]);
                cliente.setUbi((String) obj[8]);
                nro++;
                lst.add(cliente);
            }
//            for(Object[] obj:lstVO){
//                cliente.setId(0);
//            }
//            for (ClienteVO vo : lstVO) {
//                ClienteDTO cliente = new ClienteDTO(vo.getId(), nro, vo.getNombre(),
//                        vo.getDocumento() + "-" + vo.getNroDocumento(),
//                        vo.getRepresentanteLegal(), vo.getTelefono(), vo.getCelular());
//                if (vo.getDirecciones().size() != 0) {
//                    for (DireccionVO dirVO:vo.getDirecciones()){
//                        cliente.setDir(dirVO.getDireccion());
//                        cliente.setUbi(dirVO.getUbicacion());
//                    }
//                } else {
//                    cliente.setDir("");
//                    cliente.setUbi("");
//                }
//            }
        }
        log.info("Fin - obtenerClientes");
        return lst;
    }

    @Override
    public long obtenerNroTotalClientes(String nombre, String nroDocumento) {
        log.info("Inicio - obtenerNroTotalClientes");
        log.info("Fin - obtenerNroTotalClientes");
        return dao.buscarTotalClientes(nombre, nroDocumento);
    }

    @Override
    public void agregarCliente(ClienteDTO dto) {
        log.info("Inicio -  agregarCliente");
        ClienteVO vo = new ClienteVO(dto.getNombre(), dto.getDocumento(), dto.getNroDocumento(),
                dto.getRepresentante(), dto.getTelefono(), dto.getCelular(), dto.getEmail());
        List<DireccionVO> lst = new ArrayList<DireccionVO>();
        for (DireccionDTO direccion : dto.getLstDirecciones()) {
            if (direccion.isMostrar() && (direccion.getAccion() == 'N' || direccion.getAccion() == 'A')) {
                lst.add(new DireccionVO(direccion.getDireccion(), direccion.getCiudad()));
            }
        }
        vo.setDirecciones(lst);
        dao.insertar(vo);
        log.info("Fin -  agregarCliente");
    }

    @Override
    public void actualizarCliente(ClienteDTO dto) {
        log.info("Inicio - actualizarCliente");
        ClienteVO vo = (ClienteVO) dao.getEntity(ClienteVO.class, dto.getId());
        vo.setNombre(dto.getNombre());
        vo.setDocumento(dto.getDocumento());
        vo.setNroDocumento(dto.getNroDocumento());
        vo.setRepresentanteLegal(dto.getRepresentante());
        vo.setTelefono(dto.getTelefono());
        vo.setCelular(dto.getCelular());
        vo.setEmail(dto.getEmail());
        List<DireccionVO>lst=new ArrayList<DireccionVO>();
        for(DireccionDTO direccion :dto.getLstDirecciones()){
            lst.add(new DireccionVO(direccion.getId(),direccion.getDireccion(),direccion.getCiudad()));
        }
        vo.setDirecciones(lst);
        dao.actualizar(vo);
        log.info("Fin - actualizarCliente");
    }

    @Override///pararece q este no sirve
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
        List<DireccionDTO>lst=new ArrayList<DireccionDTO>();
        int nro=1,pos=0;
        for(DireccionVO direccion:vo.getDirecciones()){
            lst.add(new DireccionDTO(direccion.getId(),nro,direccion.getDireccion(),
                    direccion.getUbicacion(),true,'O',pos));
            nro++;
            pos++;
        }
        dto.setLstDirecciones(lst);
        log.info("Fin");
        return dto;
    }

//    @Override
//    public PaginacionDTO paginacionClientes(String nombre, String nroDocumento) {
//        log.info("Inicio");
//        long total = dao.buscarTotalClientes(nombre, nroDocumento);
//        PaginacionDTO dto = new PaginacionDTO();
//        if (total != 0) {
//            dto = this.page.calcular(total);
//        }
//        log.info("Fin");
//        return dto;
//    }
}
