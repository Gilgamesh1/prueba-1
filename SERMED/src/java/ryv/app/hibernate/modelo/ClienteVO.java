/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.hibernate.modelo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Raúl
 */
public class ClienteVO implements Serializable {

    private int id;
    private String nombre;
    private String documento;
    private String nroDocumento;
    private String representanteLegal;
    private String telefono;
    private String celular;
    private String email;
//    private List<DireccionVO> direcciones;
    private Set<DireccionVO> direcciones;

    public ClienteVO() {
    }

    public ClienteVO(String nombre, String documento, String nroDocumento, String representanteLegal, String telefono, String celular, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.nroDocumento = nroDocumento;
        this.representanteLegal = representanteLegal;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
    }

    public ClienteVO(int id, String nombre, String documento, String nroDocumento, String representanteLegal, String telefono, String celular, String email) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.nroDocumento = nroDocumento;
        this.representanteLegal = representanteLegal;
        this.telefono = telefono;
        this.celular = celular;
        this.email = email;
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
     * @return the representanteLegal
     */
    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    /**
     * @param representanteLegal the representanteLegal to set
     */
    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
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
     * @return the direcciones
     */
    public Set<DireccionVO> getDirecciones() {
        return direcciones;
    }

    /**
     * @param direcciones the direcciones to set
     */
    public void setDirecciones(Set<DireccionVO> direcciones) {
        this.direcciones = direcciones;
    }

}
