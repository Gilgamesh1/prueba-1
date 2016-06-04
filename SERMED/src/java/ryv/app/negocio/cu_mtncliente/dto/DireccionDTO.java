/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_mtncliente.dto;

import java.io.Serializable;

/**
 *
 * @author Raúl
 */
public class DireccionDTO implements Serializable{

    private int id;
    private int nroTabla;
    private int pos;
    private String direccion;
    private String ciudad;
    private boolean mostrar;
    private char accion;//O:Original,N:Nuevo,A:Actualizar,E:Eliminar

    public DireccionDTO() {
    }

    public DireccionDTO(int id, int nroTabla, String direccion, String ciudad, boolean mostrar, char accion, int pos) {
        this.id = id;
        this.nroTabla = nroTabla;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.mostrar = mostrar;
        this.accion = accion;
        this.pos = pos;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nroTabla
     */
    public int getNroTabla() {
        return nroTabla;
    }

    /**
     * @param nroTabla the nroTabla to set
     */
    public void setNroTabla(int nroTabla) {
        this.nroTabla = nroTabla;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the mostrar
     */
    public boolean isMostrar() {
        return mostrar;
    }

    /**
     * @param mostrar the mostrar to set
     */
    public void setMostrar(boolean mostrar) {
        this.mostrar = mostrar;
    }

    /**
     * @return the accion
     */
    public char getAccion() {
        return accion;
    }

    /**
     * @param accion the accion to set
     */
    public void setAccion(char accion) {
        this.accion = accion;
    }

    /**
     * @return the pos
     */
    public int getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(int pos) {
        this.pos = pos;
    }

}
