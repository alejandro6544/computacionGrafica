/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Alejo
 */
public class Persona {

    private String nombre;
    private String identificacion;
    private String edad;

    public Persona() {
    }

    public Persona(String nombre, String identificacion, String edad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.edad = edad;
    }

    /**
     * Get the value of edad
     *
     * @return the value of edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * Get the value of identificacion
     *
     * @return the value of identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Set the value of identificacion
     *
     * @param identificacion new value of identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", identificacion=" + identificacion + ", edad=" + edad + '}';
    }

}
