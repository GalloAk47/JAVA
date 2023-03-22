/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalong;

import java.util.Scanner;

/**
 *
 * @author Gallo_AK47
 */
public class JavaLong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
    
        String ocho;
       
        System.out.println("ingresa una frase:");
    
        ocho = leer.next();
        
        
     
        if (ocho.length()==8) {
             System.out.println("CORRECTO");
        } else {
          System.out.println("INCORRECTO");
    }
    
}
}

   