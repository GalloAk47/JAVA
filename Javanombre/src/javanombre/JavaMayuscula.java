/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanombre;

import java.util.Scanner;

/**
 *
 * @author Gallo_AK7
 */
public class JavaMayuscula {

    public static void main(String[] args) 
    { 
        Scanner leer = new Scanner(System.in);
    
        String frase;
        String fraseM;
        String frasem;
    
        System.out.println("ingresa una frase:");
    
        frase = leer.next();
    
      fraseM = frase.toUpperCase();
       
       System.out.println(fraseM);
       
       frasem=frase.toLowerCase();
       
       System.out.println(frasem);
    } }