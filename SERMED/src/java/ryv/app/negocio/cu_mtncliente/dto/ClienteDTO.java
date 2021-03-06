/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_mtncliente.dto;

import java.util.List;

/**
 *
 * @author Raúl
 */
public class ClienteDTO {

    private int id;
    private String nombre;
    private String documento;
    private String nroDocumento;
    private String representante;
    private String telefono;
    private String celular;
    private List<ClienteDTO> lstClientes;
    private List<DireccionDTO> lstDirecciones;
    private String valDocumento;
    private int nroTabla;
    private String dir;
    private String ubi;
    private int pos;
    private String email;

    public ClienteDTO() {
        this.pos = 0;
    }

    public ClienteDTO(int id, String nombre, String documento, String nroDocumento, String representante, String telefono, String celular, String email) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.nroDocumento = nroDocumento;
        this.representante = representante;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
    }

    /**
     * Constructor que llena la lista de Clientes para la grilla
     *
     * @param id identificar del registro
     * @param nroTabla numeracion para la grilla
     * @param nombre nombre del cliente
     * @param valDocumento texto de documento + nroDocumento
     * @param representante nombre del representate
     * @param telefono numero de telefono
     * @param celular numero de celular
     */
    public ClienteDTO(int id, int nroTabla, String nombre, String valDocumento, String representante, String telefono, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.representante = representante;
        this.telefono = telefono;
        this.celular = celular;
        this.valDocumento = valDocumento;
        this.nroTabla = nroTabla;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the nroDocumento
     */
    public String getNroDocumento() {
        return nroDocumento;
    }

    /**
     * @param nroDocumento the nroDocumento to set
     */
    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    /**
     * @return the representante
     */
    public String getRepresentante() {
        return representante;
    }

    /**
     * @param representante the representante to set
     */
    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the lstClientes
     */
    public List<ClienteDTO> getLstClientes() {
        return lstClientes;
    }

    /**
     * @param lstClientes the lstClientes to set
     */
    public void setLstClientes(List<ClienteDTO> lstClientes) {
        this.lstClientes = lstClientes;
    }

    /**
     * @return the valDocumento
     */
    public String getValDocumento() {
        return valDocumento;
    }

    /**
     * @param valDocumento the valDocumento to set
     */
    public void setValDocumento(String valDocumento) {
        this.valDocumento = valDocumento;
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
     * @return the dir
     */
    public String getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(String dir) {
        this.dir = dir;
    }

    /**
     * @return the ubi
     */
    public String getUbi() {
        return ubi;
    }

    /**
     * @param ubi the ubi to set
     */
    public void setUbi(String ubi) {
        this.ubi = ubi;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the lstDirecciones
     */
    public List<DireccionDTO> getLstDirecciones() {
        return lstDirecciones;
    }

    /**
     * @param lstDirecciones the lstDirecciones to set
     */
    public void setLstDirecciones(List<DireccionDTO> lstDirecciones) {
        this.lstDirecciones = lstDirecciones;
    }

}
