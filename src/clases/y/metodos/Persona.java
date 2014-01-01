/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases.y.metodos;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Persona {
    //Definimos los atributos
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    //Método 
    public void Edades(){
        //declaramos los atributos 
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        //Método para introducir una cadena de texto por la consola
        nombre = teclado.nextLine();
        System.out.print("Ingrese la edad: ");
        //Método para introducir un valor de tipo entero por la consola
        edad = teclado.nextInt();
        //condición que evalúa el atributo edad 
        if (edad>=18) {
            System.out.print(nombre + " es mayor de edad");
        }else{
           System.out.print(nombre + " es manor de edad"); 
        }
    }
}
