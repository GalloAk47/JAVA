/*
Escriba un programa en el cual se ingrese un valor limite positivo, 
y a continuacion solicite numeros al usuario hasta que la suma de los numeros 
introducidos supere el limite inicial.
 */
package javalimite;

import java.util.Scanner;

/**
 *
 * @author Gallo_AK47
 */
public class JavaLimite {


    public static void main(String[] args) {
    
        Scanner teclado = new Scanner (System.in);
        System.out.print ("Ingrese un limite: ");
        int n= teclado.nextInt();
        
       for (int i=0; i<n; i++)
        System.out.print ("Ingrese un nuevo valor: ");
        int n2 = teclado.nextInt();
        int i = 0;
       int suma= n2 + i;
       int resultado= suma+n2;
         System.out.print ("Su resultado supero el inicial: " + resultado);          
           
}
    }



