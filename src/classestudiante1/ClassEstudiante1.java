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
public class ClassEstudiante1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroDui;

        System.out.println("Nombre: ");
        String nombre = scan.next();
        System.out.println("Apellido: ");
        String apellido= scan.next();
        System.out.println("Tipo de Sangre : ");
        String tipoSangre= scan.next();
        System.out.println("Carnet: ");
        int carnet=scan.nextInt();
        System.out.println("Edad: ");
        int edad=scan.nextInt();

        Estudiante Est1 = new Estudiante(nombre, apellido, carnet, edad, tipoSangre);
        Est1.pedirDui();
    }
}


