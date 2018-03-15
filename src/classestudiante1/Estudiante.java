/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classestudiante1;

import java.util.Scanner;

/**
 *
 * @author OLMEDO
 */
public class Estudiante {
    String nombre;
    String apellido;
    int carnet;
    int edad;
    int numeroDui;
    String tipoSangre;
    //boolean mayordeEdad;
   
    public Estudiante(String nombre,String apellido, int carnet, int edad,String tipoSangre){
        this.nombre=nombre;
        this.apellido=apellido;
        this.carnet=carnet;
        this.edad=edad;
        this.tipoSangre=tipoSangre;
    }
    public void pedirDui(){
        if (edad>=18){
            Scanner scan = new Scanner(System.in);
            System.out.println("Numero de Dui : ");
            numeroDui=scan.nextInt();
        }
            
    }
            
}
