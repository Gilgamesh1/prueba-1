/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.interfaces.cu_login;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ryv.app.negocio.cu_login.Login;
import ryv.app.negocio.cu_login.dto.LoginDTO;

/**
 *
 * @author Raúl
 */
@Controller
public class LoginAction {

    protected final Logger log = Logger.getLogger(LoginAction.class);
    @Autowired
    private Login login;

    public LoginAction() {
    }

    @RequestMapping("/cargarLogin")
    public ModelAndView cargarLogin(HttpServletRequest request, HttpServletResponse response) {
        log.debug("INICIO");
        ModelAndView model = new ModelAndView("cu_login/inicio");
        model.addObject("loginDTO", new LoginDTO());
        log.debug("Fin");
        return model;
    }

    @RequestMapping(value="/insertarLogin", method = RequestMethod.GET)
    public ModelAndView insertarLogin(@ModelAttribute("object") LoginDTO loginDTO,HttpServletRequest request) {
        log.debug("INICIO");
        login.insertar(loginDTO);
        ModelAndView model = new ModelAndView("cu_login/inicio");
        log.debug("Fin");
        return model;
    }

    @RequestMapping(value="/actualizarLogin", method = RequestMethod.GET)
    public ModelAndView actualizarLogin(@ModelAttribute("object") LoginDTO loginDTO,HttpServletRequest request) {
        log.debug("INICIO");
        login.actualizar(loginDTO);
        ModelAndView model = new ModelAndView("cu_login/inicio");
        log.debug("Fin");
        return model;
    }
}
