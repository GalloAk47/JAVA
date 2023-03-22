/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaeureka;

import java.util.Scanner;

/**
 *
 * @author Gallo_AK47
 */
public class JavaEureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
    
        String frase;
        
        System.out.println("ingresa una frase:");
    
        frase = leer.next();
        
        if ("eureka".equals(frase)) {
             System.out.println("CORRECTO");
        } else {
          System.out.println("INCORRECTO");
        }
    
    }
    
}
