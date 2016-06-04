/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.paginacion.dto;

/**
 *
 * @author Raúl
 */
public class PaginacionDTO {

    private long grupoInicio;
    private long grupoFin;
    private long inicio;
    private long fin;
    private long resultado;
    private long residuo;
    private long seleccionada;
    private boolean mostrarInicio;
    private boolean mostrarFin;

    public PaginacionDTO() {
        this.grupoInicio = 0;
        this.grupoFin = 0;
        this.inicio = 0;
        this.fin = 0;
        this.resultado = 0;
        this.residuo = 0;
        this.seleccionada = 0;
        this.mostrarInicio = false;
        this.mostrarFin = false;
    }

    /**
     * @return the grupoInicio
     */
    public long getGrupoInicio() {
        return grupoInicio;
    }

    /**
     * @param grupoInicio the grupoInicio to set
     */
    public void setGrupoInicio(long grupoInicio) {
        this.grupoInicio = grupoInicio;
    }

    /**
     * @return the grupoFin
     */
    public long getGrupoFin() {
        return grupoFin;
    }

    /**
     * @param grupoFin the grupoFin to set
     */
    public void setGrupoFin(long grupoFin) {
        this.grupoFin = grupoFin;
    }

    /**
     * @return the inicio
     */
    public long getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(long inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public long getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(long fin) {
        this.fin = fin;
    }

    /**
     * @return the resultado
     */
    public long getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(long resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the residuo
     */
    public long getResiduo() {
        return residuo;
    }

    /**
     * @param residuo the residuo to set
     */
    public void setResiduo(long residuo) {
        this.residuo = residuo;
    }

    /**
     * @return the seleccionada
     */
    public long getSeleccionada() {
        return seleccionada;
    }

    /**
     * @param seleccionada the seleccionada to set
     */
    public void setSeleccionada(long seleccionada) {
        this.seleccionada = seleccionada;
    }

    /**
     * @return the mostrarInicio
     */
    public boolean isMostrarInicio() {
        return mostrarInicio;
    }

    /**
     * @param mostrarInicio the mostrarInicio to set
     */
    public void setMostrarInicio(boolean mostrarInicio) {
        this.mostrarInicio = mostrarInicio;
    }

    /**
     * @return the mostrarFin
     */
    public boolean isMostrarFin() {
        return mostrarFin;
    }

    /**
     * @param mostrarFin the mostrarFin to set
     */
    public void setMostrarFin(boolean mostrarFin) {
        this.mostrarFin = mostrarFin;
    }

    @Override
    public String toString() {
        return "PaginacionDTO{" + "grupoInicio=" + grupoInicio + ", grupoFin=" + grupoFin + ", inicio=" + inicio + ", fin=" + fin + ", resultado=" + resultado + ", residuo=" + residuo + ", seleccionada=" + seleccionada + ", mostrarInicio=" + mostrarInicio + ", mostrarFin=" + mostrarFin + '}';
    }

}
