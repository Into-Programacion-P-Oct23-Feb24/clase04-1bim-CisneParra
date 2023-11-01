/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {
    public static void main(String[] args) {
        /*
        Println vs print
        El println te genera de manera automática un salto de línea
        El print te pone todos los datos en una sola linea sin necesidad de usar mas variables en
        el mismo paréntesis.
        */
        String nombreEstudiante = "René Rolando";
        String apellidoEstudiante = "Elizalde Solano";
        int nacimiento = 1983;
        System.out.println(nombreEstudiante + " ");
        System.out.print(apellidoEstudiante + " ");
        System.out.print(nacimiento + " ");
        System.out.print(nombreEstudiante + " ");
    }
}
