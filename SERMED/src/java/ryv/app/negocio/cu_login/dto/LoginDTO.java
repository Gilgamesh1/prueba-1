/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryv.app.negocio.cu_login.dto;

/**
 *
 * @author Raúl
 */
public class LoginDTO {

    private int identificador;
    private String texto;
    private int entero;
    private double decimal;
    private String fecha;
    private String tiempo;
    private String timeStamp;

    public LoginDTO() {
        this.identificador = 0;
        this.texto = "texto";
        this.entero = 1;
        this.decimal = 1.1;
        this.fecha = "fechaaah";
//        this.fecha = new Date();
//        this.tiempo = new Date();
//        this.timeStamp = new Date();
    }

    public LoginDTO(int identificador, String texto, int entero, double decimal) {
        this.identificador = identificador;
        this.texto = texto;
        this.entero = entero;
        this.decimal = decimal;
    }

    /**
     * @return the identificador
     */
    public int getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the entero
     */
    public int getEntero() {
        return entero;
    }

    /**
     * @param entero the entero to set
     */
    public void setEntero(int entero) {
        this.entero = entero;
    }

    /**
     * @return the decimal
     */
    public double getDecimal() {
        return decimal;
    }

    /**
     * @param decimal the decimal to set
     */
    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the tiempo
     */
    public String getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the timeStamp
     */
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

}
