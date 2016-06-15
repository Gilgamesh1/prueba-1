   public MtnClienteAction() {
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
    
    