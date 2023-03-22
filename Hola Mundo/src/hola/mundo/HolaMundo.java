/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola.mundo;

/**
 *
 * @author Gallo_AK7
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
    
        scanner leer = new scanner(System.in);
    
        String nombre;
    
        System.out.println("ingresa tu nombre:");
    
        nombre = leer.next();
    
        System.out.println ("Hola mundo! Soy " + nombre + "y estoy programando en Java");}    
}


    