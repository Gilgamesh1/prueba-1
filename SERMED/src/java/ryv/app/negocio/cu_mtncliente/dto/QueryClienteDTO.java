/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_mtncliente.dto;

/**
 *
 * @author Raúl
 */
public class QueryClienteDTO {

    private int nro;
    private String nombre;
    private String documento;

    /**
     * @return the nro
     */
    public int getNro() {
        return nro;
    }

    /**
     * @param nro the nro to set
     */
    public void setNro(int nro) {
        this.nro = nro;
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
}
