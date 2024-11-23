/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionmedicalt;

/**
 *
 * @author Janely
 */public class PersonaLT {
    
    private String nombre_LT;
    private Integer Edad_LT;
    private String DireccionLT;

    public PersonaLT(String nombre_LT, Integer Edad_LT, String DireccionLT) {
        this.nombre_LT = nombre_LT;
        this.Edad_LT = Edad_LT;
        this.DireccionLT = DireccionLT;
    }  

    // Getters y Setters
    public String getNombre_LT() {
        return nombre_LT;
    }

    public void setNombre_LT(String nombre_LT) {
        this.nombre_LT = nombre_LT;
    }

    public Integer getEdad_LT() {
        return Edad_LT;
    }

    public void setEdad_LT(Integer Edad_LT) {
        this.Edad_LT = Edad_LT;
    }

    public String getDireccionLT() {
        return DireccionLT;
    }

    public void setDireccionLT(String DireccionLT) {
        this.DireccionLT = DireccionLT;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre_LT);
        System.out.println("Edad: " + Edad_LT);
        System.out.println("Dirección: " + DireccionLT);
    }
}