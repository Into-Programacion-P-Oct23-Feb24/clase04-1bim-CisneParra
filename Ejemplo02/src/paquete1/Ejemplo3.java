/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        // declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        String nombreAsignatura3;
        double notaAsignatura1;
        double notaAsignatura2;
        double notaAsignatura3;
        String nombreEstudiante;
        //agregar una nueva variable para asignatura 3
        //agregar una nueva variable para nota 3
        //obtener un promedio de las notas
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = entrada.nextLine();
        System.out.println("Ingrese nombre de asignatura 2");
        nombreAsignatura2 = entrada.nextLine();
        System.out.println("Ingrese nombre de asignatura 3");
        nombreAsignatura3 = entrada.nextLine();
        
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = entrada.nextDouble();
        System.out.println("Ingrese nota de asignatura 2");
        notaAsignatura2 = entrada.nextDouble();
        System.out.println("Ingrese nota de asignatura 3");
        notaAsignatura3 = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("Ingrese nombre de estudiante");
        nombreEstudiante = entrada.nextLine();
        double promedio = (notaAsignatura1 + notaAsignatura2 + notaAsignatura3) /3; 
        
        
        
       
        
        
        System.out.printf("Asignatura 1: %s\nNota 1:%.2f\nAsignatura 2:%s\n "
                + "Nota 2: %.2f\nNombre de estudiante: %s\nAsignatura 3:%s\nPromedio: %.2f\n",
                nombreAsignatura1,
                notaAsignatura1,
                nombreAsignatura2,
                notaAsignatura2,
                nombreAsignatura3,
                notaAsignatura3,
                promedio,
                nombreEstudiante);
   
    }
    
}
