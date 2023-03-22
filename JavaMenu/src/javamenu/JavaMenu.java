/*
realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú: suma, resta, division, mul,salir.
 */
package javamenu;

import java.util.Scanner;
import static javamenu.JavaMenu.suma;

public class JavaMenu {
static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
   
      
             
   System.out.println("1-SUMAR");
   System.out.println("2-RESTAR");
 System.out.println("3-MULTIPLICAR");
   System.out.println("4-DIVIDIR");
      System.out.println("5-SALIR");
  
            
     
      System.out.println("Seleccion una opcion");
    
        int opcion = entrada.nextInt();
    
      switch (opcion) {
       case 1:
       suma();
       break();

          
       case 2:
       resta();
   break();
         
            
       case 3:
           multipliacion();
         break();
          
    
       case 4:
           division();
       break();
           
          
       case 5:
           salida();
           break();
       }    
    
 
  
   

    private static void multipliacion() {
   int num1;
   int num2;
   int resultado;   
   System.out.println("Ingre dos numeros entero");
      
     num1 = entrada.nextInt();
     num2 = entrada.nextInt();
    
   resultado=num1*num2;
     System.out.println ("Su resultado es: " + resultado);
    }

    private static void resta() {
   int num1;
   int num2;
   int resultado;   
   System.out.println("Ingre dos numeros entero");
      
     num1 = entrada.nextInt();
     num2 = entrada.nextInt();
    
   resultado=num1-num2;
     System.out.println ("Su resultado es: " + resultado);
    }

    private static void division() {
   int num1;
   int num2;
   int resultado;   
   System.out.println("Ingre dos numeros entero");
      
     num1 = entrada.nextInt();
     num2 = entrada.nextInt();
    
   resultado=num1/num2;
     System.out.println ("Su resultado es: " + resultado);
    }

    private static void salida() {
      }

    private static void suma() {
   int num1;
   int num2;
   int resultado;   
   System.out.println("Ingre dos numeros entero");
      
     num1 = entrada.nextInt();
     num2 = entrada.nextInt();
    
   resultado=num1+num2;
     System.out.println ("Su resultado es: " + resultado);
            
            
      }
    }
        
      
  
  
    
