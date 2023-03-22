/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagradosf;

import java.util.Scanner;

/**
 *
 * @author Gallo_AK7
 */
public class JavaGradosF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner entrada = new Scanner(System.in);
        int gradosC;
        int gradosF;
             
      System.out.println("Ingre una cantidad de grados centigrados");
      gradosC = entrada.nextInt();
     
      gradosF = 32 + (9 * gradosC / 5);
      
      System.out.println("En grados Farnsworth " + gradosF);
      
    }
    
}
