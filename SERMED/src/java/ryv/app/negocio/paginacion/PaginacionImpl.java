/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.paginacion;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import ryv.app.negocio.paginacion.dto.PaginacionDTO;

/**
 *
 * @author Raúl
 */
@Component
public class PaginacionImpl implements Paginacion {

    private final Logger log = Logger.getLogger(PaginacionImpl.class);

    @Override
    public PaginacionDTO calcular(long totalRegistros) {
        log.info("Inicio - calcular");
        long resultado = totalRegistros / CONST_GRUPO;
        long residuo = totalRegistros % CONST_GRUPO;
        PaginacionDTO dto = new PaginacionDTO();
        dto.setResultado(resultado);
        dto.setResiduo(residuo);
        dto.setSeleccionada(1);
        dto.setInicio(1);
        dto.setGrupoInicio(0);
        dto.setMostrarInicio(false);
        if (resultado > CONST_GRUPO) {
            dto.setFin(CONST_GRUPO);
            dto.setMostrarFin(true);
            dto.setGrupoFin(CONST_GRUPO + 1);
        } else {
            if (residuo == 0) {
                dto.setFin(resultado);
            } else {
                dto.setFin(resultado + 1);
            }
            dto.setGrupoFin(0);
            dto.setMostrarFin(false);
        }
        log.info("Fin - calcular");
        return dto;
    }

    @Override
    public PaginacionDTO grupoSiguiente(PaginacionDTO dto) {
        log.info("Inicio - grupoSiguiente");
        long sgtGrupo = dto.getFin() + CONST_GRUPO;
        dto.setGrupoInicio(dto.getGrupoFin() - 1);
        dto.setInicio(dto.getGrupoFin());
        dto.setMostrarInicio(true);
        dto.setSeleccionada(dto.getGrupoFin());
        if (dto.getResultado() > sgtGrupo) {
            dto.setFin(sgtGrupo);
            dto.setGrupoFin(sgtGrupo + 1);
            dto.setMostrarFin(true);
        } else {
            if (dto.getResiduo() == 0) {
                dto.setFin(dto.getResultado());
            } else {
                dto.setFin(dto.getResultado() + 1);
            }
            dto.setGrupoFin(0);
            dto.setMostrarFin(false);
        }
        log.info("Fin - grupoSiguiente");
        return dto;
    }

    @Override
    public PaginacionDTO grupoAnterior(PaginacionDTO dto) {
        log.info("Inicio - grupoAnterior");
        long antGrupo = dto.getGrupoInicio();
        dto.setGrupoInicio(dto.getGrupoInicio() - CONST_GRUPO);
        dto.setInicio(antGrupo - CONST_GRUPO + 1);
        dto.setFin(antGrupo);
        dto.setGrupoFin(antGrupo+1);
        dto.setMostrarFin(true);
        dto.setSeleccionada(antGrupo);
        if ((antGrupo - CONST_GRUPO) == 0) {
            dto.setMostrarInicio(false);
        } else {
            dto.setMostrarInicio(true);
        }
        log.info("Fin - grupoAnterior");
        return dto;
    }
}
