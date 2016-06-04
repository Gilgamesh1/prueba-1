/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.interfaces.cu_mtncliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ryv.app.negocio.cu_mtncliente.MtnCliente;
import ryv.app.negocio.cu_mtncliente.dto.ClienteDTO;
import ryv.app.negocio.comun.dto.ComboDTO;
import ryv.app.negocio.cu_mtncliente.dto.DireccionDTO;
import ryv.app.negocio.cu_mtncliente.dto.PruebaDTO;
import ryv.app.negocio.paginacion.dto.PaginacionDTO;

/**
 *
 * @author Raúl
 */
@Controller
//@SessionAttributes("lstDirecciones")
public class MtnClienteAction {
    
    private final Logger log = Logger.getLogger(MtnClienteAction.class);
    @Autowired
    private MtnCliente mtnCliente;
    
    public MtnClienteAction() {
    }
    
    public List<ComboDTO> cargarCombo() {
        List<ComboDTO> cmb = new ArrayList<ComboDTO>();
        cmb.add(new ComboDTO("0", "Seleccione"));
        cmb.add(new ComboDTO("DNI", "DNI"));
        cmb.add(new ComboDTO("RUC", "RUC"));
        return cmb;
    }
    
    @RequestMapping(value = "/MtnCliente/cargar")
    public ModelAndView cargarMtnCliente(HttpSession session) {
        log.info("Inicio - cargarMtnCliente");
        ClienteDTO dto = new ClienteDTO();
        List<ComboDTO> cmb = cargarCombo();
        List<DireccionDTO> lstDir = new ArrayList<DireccionDTO>();
        session.setAttribute("lstDirecciones", lstDir);
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", dto);
        mav.addObject("cmbClientes", cmb);
        mav.addObject("lstDirecciones", lstDir);
        log.info("Fin - cargarMtnCliente");
        return mav;
    }
    
    @RequestMapping(value = "/MtnCliente/cargarLista")
    public ModelAndView cargarListaMtnCliente() {
        log.info("Inicio - cargarListaMtnCliente");
        List<ClienteDTO> lst = mtnCliente.buscarTodos();
        PaginacionDTO pDTO = this.mtnCliente.paginacion(259);
        log.info(pDTO);
        pDTO.setSeleccionada(11);
        pDTO = this.mtnCliente.paginacionS(pDTO);
        log.info(pDTO);
        pDTO.setSeleccionada(3);
        pDTO = this.mtnCliente.paginacionA(pDTO);
        log.info(pDTO);
        ClienteDTO dto = new ClienteDTO();
        ModelAndView mav = new ModelAndView("cu_mtncliente/listarClientes");
        mav.addObject("cliente", dto);
        mav.addObject("lstClientes", lst);
        mav.addObject("page", pDTO);
        log.info("Fin - cargarListaMtnCliente");
        return mav;
    }
    
    @RequestMapping(value = "/MtnCliente/insertar", method = RequestMethod.POST)
    public String insertarMtnCliente(@ModelAttribute("object") ClienteDTO dto, HttpServletRequest request) {
        log.info("Inicio - insertarMtnCliente");
        String val = (String) request.getParameter("t2");
        dto.setDocumento(val);
        this.mtnCliente.agregarCliente(dto);
        ClienteDTO cliente = new ClienteDTO();
        ModelAndView mav = new ModelAndView("cu_mtncliente/listarClientes");
        mav.addObject("cliente", cliente);
        log.info("Fin - insertarMtnCliente");
        return "redirect:/MtnCliente/cargarLista.html";
    }
    
    @RequestMapping(value = "/MtnCliente/actualizar", method = RequestMethod.POST)
    public String actualizarMtnCliente(@ModelAttribute("object") ClienteDTO dto, HttpServletRequest request) {
        log.info("Inicio - actualizarMtnCliente");
        String val = (String) request.getParameter("t2");
        dto.setDocumento(val);
        this.mtnCliente.actualizarCliente(dto);
        ClienteDTO cliente = new ClienteDTO();
        ModelAndView mav = new ModelAndView("cu_mtncliente/listarClientes");
        mav.addObject("cliente", cliente);
        log.info("Fin - actualizarMtnCliente");
        return "redirect:/MtnCliente/cargarLista.html";
    }
    
    @RequestMapping(value = "/MtnCliente/buscar")
    public ModelAndView buscarMtnCliente(@ModelAttribute("object") ClienteDTO dto, HttpServletRequest request) {
        log.info("Inicio - buscarMtnCliente");
        List<ClienteDTO> lst = this.mtnCliente.obtenerClientes(dto.getNombre(), dto.getNroDocumento());
        PaginacionDTO pDTO = this.mtnCliente.paginacionClientes(dto.getNombre(), dto.getNroDocumento());
        List<ComboDTO> cmb = cargarCombo();
        ModelAndView mav = new ModelAndView("cu_mtncliente/listarClientes");
        mav.addObject("cliente", dto);
        mav.addObject("lstClientes", lst);
        mav.addObject("cmbClientes", cmb);
        log.info("Fin - buscarMtnCliente");
        return mav;
    }
    
    @RequestMapping(value = "/json", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody 
    public Map<String, Object> buscarMtnClienteJson(HttpServletRequest request) {
        log.info("Inicio - buscarMtnClienteJson");
        String val1=request.getParameter("b1");//@RequestParam("b1") String val1
        log.info("**********val1: "+val1);
        Map<String, Object> map = new HashMap<String, Object>();
        List<ClienteDTO> lst = this.mtnCliente.buscarTodos();//this.mtnCliente.obtenerClientes(val1, val2);
        for (int i = 0; i < lst.size(); i++) {
            ClienteDTO dto = lst.get(i);
            map.put("nombre" + i, dto.getNombre());
        }
        log.info(map.toString());
        log.info("Fin - buscarMtnClienteJson");
        return map;
    }
    
    
    @RequestMapping(value = "/json1", produces = "application/json")
    @ResponseBody 
    public PruebaDTO ClienteJson(@RequestBody PruebaDTO dto) {
        log.info("Inicio - ClienteJson");
        log.info("**********val1: "+dto);
        Map<String, Object> map = new HashMap<String, Object>();
        List<ClienteDTO> lst = this.mtnCliente.buscarTodos();//this.mtnCliente.obtenerClientes(val1, val2);
        for (int i = 0; i < lst.size(); i++) {
            ClienteDTO dto1 = lst.get(i);
            map.put("nombre " + i, dto1.getNombre());
        }
        log.info(map.toString());
        log.info("Fin - ClienteJson");
        PruebaDTO t=new PruebaDTO();
        return t;
    }
    
    @RequestMapping(value = "/MtnCliente/cargarUnCliente")
    public ModelAndView cargarUnCliente(HttpServletRequest request) {
        log.info("Inicio - cargarUnCliente");
        int val1 = Integer.parseInt((String) request.getParameter("id"));
        ClienteDTO dto = this.mtnCliente.obtenerCliente(val1);
        List<ComboDTO> cmb = cargarCombo();
        if (dto.getDocumento().equals("DNI")) {
            cmb.get(1).setSeleccionado(true);
        } else {
            cmb.get(2).setSeleccionado(true);
        }
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", dto);
        mav.addObject("cmbClientes", cmb);
        log.info("Fin - cargarUnCliente");
        return mav;
    }
    
    @RequestMapping(value = "/MtnCliente/agregarDireccion")
    public ModelAndView agregarDireccion(HttpServletRequest request, HttpSession session) {
        log.info("Inicio - agregarDireccion");
        List<DireccionDTO> lstD = (List<DireccionDTO>) session.getAttribute("lstDirecciones");
        if (lstD == null) {
            lstD = new ArrayList<DireccionDTO>();
//             session=request.getSession();
        }
        int total = lstD.size() + 1;
        String direccion = request.getParameter("b1");
        String ciudad = request.getParameter("b2");
        lstD.add(new DireccionDTO(0, total, direccion, ciudad, true, 'N', total - 1));
        session.setAttribute("lstDirecciones", lstD);
        ClienteDTO dto = new ClienteDTO();
        List<ComboDTO> cmb = cargarCombo();
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", dto);
        mav.addObject("cmbClientes", cmb);
        mav.addObject("lstDirecciones", lstD);
        log.info("Fin - agregarDireccion");
        return mav;
    }
    
    
    @RequestMapping(value = "/MtnCliente/cargarDireccion")
    public ModelAndView cargarDireccion(HttpServletRequest request, HttpSession session) {
        log.info("Inicio - cargarDireccion");
        List<DireccionDTO> lstD = (List<DireccionDTO>) session.getAttribute("lstDirecciones");
        int pos = Integer.parseInt(request.getParameter("b3"));
        DireccionDTO dirDto = lstD.get(pos);
        ClienteDTO dto = new ClienteDTO();
        List<ComboDTO> cmb = cargarCombo();
        dto.setDir(dirDto.getDireccion());
        dto.setUbi(dirDto.getCiudad());
        dto.setPos(request.getParameter("b3"));
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", dto);
        mav.addObject("cmbClientes", cmb);
        mav.addObject("lstDirecciones", lstD);
        log.info("Fin - cargarDireccion");
        return mav;
    }
    
    @RequestMapping(value = "/MtnCliente/actualizarDireccion")
    public ModelAndView actualizarDireccion(HttpServletRequest request, HttpSession session) {
        log.info("Inicio - actualizarDireccion");
        List<DireccionDTO> lstD = (List<DireccionDTO>) session.getAttribute("lstDirecciones");
        int pos = Integer.parseInt(request.getParameter("b3"));
        String direccion = request.getParameter("b1");
        String ciudad = request.getParameter("b2");
        DireccionDTO dirDto = lstD.get(pos);
        dirDto.setDireccion(direccion);
        dirDto.setCiudad(ciudad);
        dirDto.setAccion('A');
        session.setAttribute("lstDirecciones", lstD);
        ClienteDTO dto = new ClienteDTO();
        List<ComboDTO> cmb = cargarCombo();
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", dto);
        mav.addObject("cmbClientes", cmb);
        mav.addObject("lstDirecciones", lstD);
        log.info("Fin - actualizarDireccion");
        return mav;
    }
    
    @RequestMapping(value = "/MtnCliente/eliminarDireccion")
    public ModelAndView eliminarDireccion(HttpServletRequest request, HttpSession session) {
        log.info("Inicio - eliminarDireccion");
        List<DireccionDTO> lstD = (List<DireccionDTO>) session.getAttribute("lstDirecciones");
        if (lstD == null) {
            lstD = new ArrayList<DireccionDTO>();
        }
        int nro = 1;
        int pos = Integer.parseInt(request.getParameter("id"));
        for (DireccionDTO dirDto : lstD) {
            if (dirDto.getPos()== pos) {
                dirDto.setMostrar(false);
                dirDto.setAccion('E');
            } else {
                dirDto.setNroTabla(nro);
                nro++;
            }
        }
        session.setAttribute("lstDirecciones", lstD);
        ClienteDTO dto = new ClienteDTO();
        List<ComboDTO> cmb = cargarCombo();
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", dto);
        mav.addObject("cmbClientes", cmb);
        mav.addObject("lstDirecciones", lstD);
        log.info("Fin - eliminarDireccion");
        return mav;
    }
}
