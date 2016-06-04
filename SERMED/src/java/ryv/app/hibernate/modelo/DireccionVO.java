/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.hibernate.modelo;

import java.io.Serializable;

/**
 *
 * @author Raúl
 */
public class DireccionVO implements Serializable {

    private int id;
    private ClienteVO cliente;
    private String direccion;
    private String ubicacion;

    public DireccionVO() {
    }

//    public DireccionVO(int id, ClienteVO cliente, String direccion, String ubicacion) {
//        this.id = id;
//        this.cliente = cliente;
//        this.direccion = direccion;
//        this.ubicacion = ubicacion;
//    }

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
     * @return the cliente
     */
    public ClienteVO getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(ClienteVO cliente) {
        this.cliente = cliente;
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
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
