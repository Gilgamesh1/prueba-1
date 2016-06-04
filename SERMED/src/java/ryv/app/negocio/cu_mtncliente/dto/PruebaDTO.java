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
public class PruebaDTO {

    private int id;
    private String nom;

    public PruebaDTO() {
        this.id=2;
        this.nom="desde el metodo usando class PruebaDTO";
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
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "PruebaDTO{" + "id=" + id + ", nom=" + nom + '}';
    }

}
