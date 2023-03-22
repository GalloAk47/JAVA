/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaraiz;

import static java.lang.Math.floor;
import static java.lang.StrictMath.floor;
import java.util.Scanner;

/**
 *
 * @author Gallo_AK7
 */
public class JavaRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
        int num1;
             
     System.out.println("Ingre un numero entero");
      
     num1 = entrada.nextInt();
    
    System.out.println("El doble de su numero es: " + num1*2);
      
    System.out.println("El triple de su numero es: " + num1*3);
   
    double raiz= Math.sqrt(num1);
    
   System.out.println("La raiz cuadrada de su numero es: " + raiz);
}
}
