/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedicalt;

/**
 *
 * @author Janely
 */
public class MedicoLT extends PersonaLT {
    private String Especialidad_LT;
    private Integer aniosExperiencia_LT;

    public MedicoLT(String nombre_LT, Integer Edad_LT, String DireccionLT, String Especialidad_LT, Integer aniosExperiencia_LT) {
        super(nombre_LT, Edad_LT, DireccionLT);
        this.Especialidad_LT = Especialidad_LT;
        this.aniosExperiencia_LT = aniosExperiencia_LT;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Especialidad: " + Especialidad_LT);
        System.out.println("Años de Experiencia: " + aniosExperiencia_LT);
    }
}
    
            
    

