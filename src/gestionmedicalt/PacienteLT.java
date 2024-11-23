/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedicalt;

/**
 *
 * @author Janely
 */
public class PacienteLT extends PersonaLT {
    
    private Integer nroHistorial_LT;
    private String Enfermedad_LT;

    public PacienteLT(String nombre_LT, Integer Edad_LT, String DireccionLT, Integer nroHistorial_LT, String Enfermedad_LT) {
        super(nombre_LT, Edad_LT, DireccionLT);
        this.nroHistorial_LT = nroHistorial_LT;
        this.Enfermedad_LT = Enfermedad_LT;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Número de Historial: " + nroHistorial_LT);
        System.out.println("Enfermedad: " + Enfermedad_LT);
    }
    
}