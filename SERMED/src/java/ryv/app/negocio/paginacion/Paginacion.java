/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.paginacion;

import ryv.app.negocio.paginacion.dto.PaginacionDTO;

/**
 *
 * @author Raúl
 */
public interface Paginacion {

    static final int CONST_GRUPO = 10;

    public PaginacionDTO calcular(long totalRegistros);

    public PaginacionDTO grupoSiguiente(PaginacionDTO dto);

    public PaginacionDTO grupoAnterior(PaginacionDTO dto);
}
