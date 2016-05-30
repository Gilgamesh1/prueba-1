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
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ryv.app.negocio.cu_mtncliente.MtnCliente;
import ryv.app.negocio.cu_mtncliente.dto.ClienteDTO;
import ryv.app.negocio.cu_mtncliente.dto.CmbMtnCliente;

/**
 *
 * @author Raúl
 */
@Controller
public class MtnClienteAction {

    private final Logger log = Logger.getLogger(MtnClienteAction.class);
    @Autowired
    private MtnCliente mtnCliente;

    public MtnClienteAction() {
    }

    public List<CmbMtnCliente> cargarCombo() {
        List<CmbMtnCliente> cmb = new ArrayList<CmbMtnCliente>();
        cmb.add(new CmbMtnCliente("0", "Seleccione"));
        cmb.add(new CmbMtnCliente("DNI", "DNI"));
        cmb.add(new CmbMtnCliente("RUC", "RUC"));
        return cmb;
    }

    @RequestMapping("/cargarMtnCliente")
    public ModelAndView cargarMtnCliente() {
        log.info("inicio");
        ClienteDTO dto = new ClienteDTO();
        List<CmbMtnCliente> cmb = cargarCombo();
        List<ClienteDTO> lst = mtnCliente.buscarTodos();
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", dto);
        mav.addObject("lstClientes", lst);
        mav.addObject("cmbClientes", cmb);
        log.info("fin");
        return mav;
    }

    @RequestMapping(value = "/MtnCliente/insertar", method = RequestMethod.POST)
    public ModelAndView insertarMtnCliente(@ModelAttribute("object") ClienteDTO dto, HttpServletRequest request) {
        log.info("inicio");
        String val = (String) request.getParameter("t2");
        dto.setDocumento(val);
        this.mtnCliente.agregarCliente(dto);
        ClienteDTO cliente = new ClienteDTO();
        List<ClienteDTO> lst = this.mtnCliente.buscarTodos();
        List<CmbMtnCliente> cmb = cargarCombo();
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", cliente);
        mav.addObject("lstClientes", lst);
        mav.addObject("cmbClientes", cmb);
        log.info("fin");
        return mav;
    }

    @RequestMapping(value = "/actualizarMtnCliente", method = RequestMethod.POST)
    public ModelAndView actualizarMtnCliente(@ModelAttribute("object") ClienteDTO dto, HttpServletRequest request) {
        log.info("inicio");
        String val = (String) request.getParameter("t2");
        dto.setDocumento(val);
        this.mtnCliente.actualizarCliente(dto);
        ClienteDTO cliente = new ClienteDTO();
        List<ClienteDTO> lst = this.mtnCliente.buscarTodos();
        List<CmbMtnCliente> cmb = cargarCombo();
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", cliente);
        mav.addObject("lstClientes", lst);
        mav.addObject("cmbClientes", cmb);
        log.info("fin");
        return mav;
    }

    @RequestMapping(value = "/buscarMtnCliente")
    public ModelAndView buscarMtnCliente(HttpServletRequest request) {
        log.info("inicio");
        String val1 = (String) request.getParameter("b1");
        String val2 = (String) request.getParameter("b2");
        List<ClienteDTO> lst = this.mtnCliente.obtenerClientes(val1, val2);
        List<CmbMtnCliente> cmb = cargarCombo();
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        ClienteDTO cliente = new ClienteDTO();
        mav.addObject("cliente", cliente);
        mav.addObject("lstClientes", lst);
        mav.addObject("cmbClientes", cmb);
        log.info("fin");
        return mav;
    }

    @RequestMapping(value = "/buscarMtnCliente/json", produces = "application/json")
    @ResponseBody
    public Map<String, Object> buscarMtnClienteJson(@RequestParam("b1") String val1, @RequestParam("b2") String val2) {
        log.info("inicio");
        Map<String, Object> map = new HashMap<String, Object>();
        List<ClienteDTO> lst = this.mtnCliente.obtenerClientes(val1, val2);
        for (int i = 0; i < lst.size(); i++) {
            ClienteDTO dto = lst.get(i);
            map.put("nombre" + i, dto.getNombre());
        }
        log.info("fin");
        return map;
    }

    @RequestMapping(value = "/cargarUnCliente")
    public ModelAndView cargarUnCliente(HttpServletRequest request) {
        log.info("inicio");
        int val1 = Integer.parseInt((String) request.getParameter("id"));
        ClienteDTO dto = this.mtnCliente.obtenerCliente(val1);
        List<ClienteDTO> lst = this.mtnCliente.buscarTodos();
        List<CmbMtnCliente> cmb = cargarCombo();
        if(dto.getDocumento().equals("DNI")){
            cmb.get(1).setSeleccionado(true);
        }else{
            cmb.get(2).setSeleccionado(true);
        }
        ModelAndView mav = new ModelAndView("cu_mtncliente/mtnCliente");
        mav.addObject("cliente", dto);
        mav.addObject("lstClientes", lst);
        mav.addObject("cmbClientes", cmb);
        log.info("fin");
        return mav;
    }
}
