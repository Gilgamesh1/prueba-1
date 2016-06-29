/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.interfaces.cu_mtncliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import ryv.app.negocio.cu_mtncliente.MtnCliente;
import ryv.app.negocio.cu_mtncliente.dto.ClienteDTO;
import ryv.app.negocio.comun.dto.ComboDTO;
import ryv.app.negocio.cu_mtncliente.dto.DireccionDTO;
import ryv.app.negocio.cu_mtncliente.dto.QueryClienteDTO;
import ryv.app.negocio.paginacion.PaginacionImpl;
import ryv.app.negocio.paginacion.dto.PaginacionDTO;

/**
 *
 * @author Raúl
 */
@Controller
@SessionAttributes({"page", "lstDirecciones"})
public class MtnClienteAction {

    private final Logger log = Logger.getLogger(MtnClienteAction.class);
    @Autowired
    private MtnCliente mtnCliente;
    @Autowired
    private PaginacionImpl paginacion;

    public List<ComboDTO> cargarCombo() {
        List<ComboDTO> cmb = new ArrayList<ComboDTO>();
        cmb.add(new ComboDTO("0", "Seleccione"));
        cmb.add(new ComboDTO("DNI", "DNI"));
        cmb.add(new ComboDTO("RUC", "RUC"));
        return cmb;
    }

    @RequestMapping(value = "/MtnCliente/cargarLista")
    public String cargarListaMtnCliente(Model model) {//, SessionStatus ss
        log.info("Inicio - cargarListaMtnCliente");
//        ss.setComplete();
        List<ClienteDTO> lst1 = mtnCliente.buscarTodos();
        List<ClienteDTO> lst = mtnCliente.obtenerClientes("", "", 1);
        long total = mtnCliente.obtenerNroTotalClientes("", "");
        PaginacionDTO pDTO = this.paginacion.calcular(total);
        ClienteDTO dto = new ClienteDTO();
        model.addAttribute("cliente", dto);
        model.addAttribute("lstClientes", lst);
        model.addAttribute("page", pDTO);
        log.info("Fin - cargarListaMtnCliente");
        return "cu_mtncliente/listarClientes";
    }

    @RequestMapping(value = "/MtnCliente/buscar")
    public String buscarMtnCliente(@ModelAttribute("cliente") ClienteDTO dto, Model model) {
        log.info("Inicio - buscarMtnCliente");
        List<ClienteDTO> lst = this.mtnCliente.obtenerClientes(dto.getNombre(), dto.getNroDocumento(), 1);
        long total = mtnCliente.obtenerNroTotalClientes(dto.getNombre(), dto.getNroDocumento());
        PaginacionDTO pDTO = this.paginacion.calcular(total);
        model.addAttribute("cliente", dto);
        model.addAttribute("lstClientes", lst);
        model.addAttribute("page", pDTO);
        log.info("Fin - buscarMtnCliente");
        return "cu_mtncliente/listarClientes";
    }

    @RequestMapping(value = "/MtnCliente/pagina", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public List<ClienteDTO> buscarSeleccionBCliente(@RequestBody QueryClienteDTO query) {
        log.info("Inicio - buscarSeleccionBCliente");
        List<ClienteDTO> lst = this.mtnCliente.obtenerClientes(query.getNombre(),
                query.getDocumento(), query.getNro());
        log.info("Fin - buscarSeleccionBCliente");
        return lst;
    }

    @RequestMapping(value = "/MtnCliente/seleccionPagina", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public PaginacionDTO seleccionPagina(@RequestBody QueryClienteDTO query, Model model) {
        log.info("Inicio - seleccionPagina");
        Map map = model.asMap();
        PaginacionDTO pDTO = (PaginacionDTO) map.get("page");
        log.info(pDTO);
        pDTO.setSeleccionada(query.getNro());
        log.info(pDTO);
        model.addAttribute("page", pDTO);
        log.info("Fin - seleccionPagina");
        return pDTO;
    }

    @RequestMapping(value = "/MtnCliente/seleccionGrupoAnterior", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public PaginacionDTO seleccionGrupoAnterior(@RequestBody QueryClienteDTO query, Model model) {
        log.info("Inicio - seleccionGrupoAnterior");
        Map map = model.asMap();
        PaginacionDTO pDTO = (PaginacionDTO) map.get("page");
        log.info(pDTO);
        pDTO = this.paginacion.grupoAnterior(pDTO);
        log.info(pDTO);
        model.addAttribute("page", pDTO);
        log.info("Fin - seleccionGrupoAnterior");
        return pDTO;
    }

    @RequestMapping(value = "/MtnCliente/seleccionGrupoSiguiente", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public PaginacionDTO seleccionGrupoSiguiente(@RequestBody QueryClienteDTO query, Model model) {
        log.info("Inicio - seleccionGrupoSiguiente");
        Map map = model.asMap();
        PaginacionDTO pDTO = (PaginacionDTO) map.get("page");
        log.info(pDTO);
        pDTO = this.paginacion.grupoSiguiente(pDTO);
        log.info(pDTO);
        model.addAttribute("page", pDTO);
        log.info("Fin - seleccionGrupoSiguiente");
        return pDTO;
    }

    @RequestMapping(value = "/MtnCliente/cargar")
    public String cargarMtnCliente(Model model) {
        log.info("Inicio - cargarMtnCliente");
        ClienteDTO dto = new ClienteDTO();
        List<ComboDTO> cmb = cargarCombo();
        List<DireccionDTO> lstDir = new ArrayList<DireccionDTO>();
        model.addAttribute("cliente", dto);
        model.addAttribute("cmbClientes", cmb);
        model.addAttribute("lstDirecciones", lstDir);
        log.info("Fin - cargarMtnCliente");
        return "cu_mtncliente/mtnCliente";
    }

    @RequestMapping(value = "/MtnCliente/agregarDireccion", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public List<DireccionDTO> agregarDireccion(@RequestBody DireccionDTO dto, Model model) {
        log.info("Inicio - agregarDireccion");
        Map map = model.asMap();
        List<DireccionDTO> lst = (List<DireccionDTO>) map.get("lstDirecciones");
        int nro = 1;
        for (DireccionDTO dir : lst) {
            if (dir.getAccion() != 'E') {
                dir.setNroTabla(nro);
                nro++;
            }
        }
        dto.setId(0);
        dto.setNroTabla(nro);
        dto.setPos(lst.size());
        dto.setMostrar(true);
        dto.setAccion('N');
        lst.add(dto);
        log.info(lst);
        model.addAttribute("lstDirecciones", lst);
        log.info("Fin - agregarDireccion");
        return lst;
    }

    @RequestMapping(value = "/MtnCliente/cargarDireccion", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public DireccionDTO cargarDireccion(@RequestBody DireccionDTO dto, Model model) {
        log.info("Inicio - cargarDireccion");
        Map map = model.asMap();
        List<DireccionDTO> lst = (List<DireccionDTO>) map.get("lstDirecciones");
        DireccionDTO direccion = lst.get(dto.getPos());
        log.info(lst);
        log.info("Fin - cargarDireccion");
        return direccion;
    }

    @RequestMapping(value = "/MtnCliente/actualizarDireccion", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public List<DireccionDTO> actualizarDireccion(@RequestBody DireccionDTO dto, Model model) {
        log.info("Inicio - actualizarDireccion");
        Map map = model.asMap();
        List<DireccionDTO> lst = (List<DireccionDTO>) map.get("lstDirecciones");
        DireccionDTO direccion = lst.get(dto.getPos());
        direccion.setDireccion(dto.getDireccion());
        direccion.setCiudad(dto.getCiudad());
        if (direccion.getId() == 0) {
            direccion.setAccion('N');
        } else {
            direccion.setAccion('A');
        }
        model.addAttribute("lstDirecciones", lst);
        log.info(lst);
        log.info("Fin - actualizarDireccion");
        return lst;
    }

    @RequestMapping(value = "/MtnCliente/eliminarDireccion", produces = "application/json", method = RequestMethod.POST)
    @ResponseBody
    public List<DireccionDTO> eliminarDireccion(@RequestBody DireccionDTO dto, Model model) {
        log.info("Inicio - eliminarDireccion");
        Map map = model.asMap();
        List<DireccionDTO> lst = (List<DireccionDTO>) map.get("lstDirecciones");
        int nro = 1;
        for (DireccionDTO direccion : lst) {
            if (direccion.getPos() == dto.getPos()) {
                direccion.setMostrar(false);
                direccion.setAccion('E');
            } else {
                direccion.setNroTabla(nro);
                nro++;
            }
        }
        model.addAttribute("lstDirecciones", lst);
        log.info(lst);
        log.info("Fin - eliminarDireccion");
        return lst;
    }

    @RequestMapping(value = "/MtnCliente/agregarCliente")
    public String agregarCliente(@ModelAttribute("cliente") ClienteDTO dto, Model model, HttpServletRequest request) {
        log.info("Inicio - agregarCliente");
        Map map = model.asMap();
        List<DireccionDTO> lst = (List<DireccionDTO>) map.get("lstDirecciones");
        int total = lst.size(), nroEliminados = 0;
        //valido que por lo menos exista una dirección
        for (DireccionDTO direccion : lst) {
            if (direccion.getAccion() == 'E') {
                nroEliminados++;
            }
        }
        if (total == nroEliminados) {

        }
        String documento = request.getParameter("t3");
        dto.setDocumento(documento);
        dto.setLstDirecciones(lst);
        this.mtnCliente.agregarCliente(dto);
        log.info("Fin - agregarCliente");
        return "redirect:/MtnCliente/cargarLista.html";
    }

    @RequestMapping(value = "/MtnCliente/cargarUnCliente")
    public String cargarUnCliente(Model model, HttpServletRequest request) {
        log.info("Inicio - cargarUnCliente");
        int val1 = Integer.parseInt((String) request.getParameter("id"));
        ClienteDTO dto = this.mtnCliente.obtenerCliente(val1);
        List<ComboDTO> cmb = cargarCombo();
        if (dto.getDocumento().equals("DNI")) {
            cmb.get(1).setSeleccionado(true);
        } else {
            cmb.get(2).setSeleccionado(true);
        }
        model.addAttribute("cliente", dto);
        model.addAttribute("cmbClientes", cmb);
        model.addAttribute("lstDirecciones", dto.getLstDirecciones());
        log.info("Fin - cargarUnCliente");
        return "cu_mtncliente/mtnCliente";
    }

    @RequestMapping(value = "/MtnCliente/modificarCliente")
    public String modificarCliente(@ModelAttribute("cliente") ClienteDTO dto, Model model, HttpServletRequest request) {
        log.info("Inicio - modificarCliente");
        Map map = model.asMap();
        List<DireccionDTO> lst = (List<DireccionDTO>) map.get("lstDirecciones");
        String documento = request.getParameter("t3");
        dto.setDocumento(documento);
        dto.setLstDirecciones(lst);
        this.mtnCliente.actualizarCliente(dto);
        log.info("Fin - modificarCliente");
        return "redirect:/MtnCliente/cargarLista.html";
    }
    
    @RequestMapping(value = "/x")
    public String x() {
        return "interfaces/inicio";
    }
    
    @RequestMapping(value = "/y")
    public String y() {
        return "interfaces/mtnycalibracion";
    }
    
    @RequestMapping(value = "/z")
    public String z() {
        return "interfaces/ingresoactividad";
    }
    
    @RequestMapping(value = "/a")
    public String a() {
        return "interfaces/ingresodedatos";
    }
    
    @RequestMapping(value = "/b")
    public String b() {
        return "interfaces/mantenimiento";
    }
    
    @RequestMapping(value = "/c")
    public String c() {
        return "interfaces/caracterizacion";
    }
    
    @RequestMapping(value = "/d")
    public String d() {
        return "interfaces/equipomedicion";
    }
}
    
