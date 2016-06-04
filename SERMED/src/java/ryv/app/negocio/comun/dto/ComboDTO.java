/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.comun.dto;

/**
 *
 * @author Raúl
 */
public class ComboDTO {

    private String id;
    private String val;
    private boolean seleccionado;

    public ComboDTO() {
    }

    public ComboDTO(String id, String val) {
        this.id = id;
        this.val = val;
        this.seleccionado = false;
    }

    public ComboDTO(String id, String val, boolean seleccionado) {
        this.id = id;
        this.val = val;
        this.seleccionado = seleccionado;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the val
     */
    public String getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    public void setVal(String val) {
        this.val = val;
    }

    /**
     * @return the seleccionado
     */
    public boolean isSeleccionado() {
        return seleccionado;
    }

    /**
     * @param seleccionado the seleccionado to set
     */
    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }
}
