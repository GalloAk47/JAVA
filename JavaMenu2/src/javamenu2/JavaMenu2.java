
package javamenu2;

import java.util.Scanner;
/**
 *
 * @author Gallo_AK7
 */

public class JavaMenu2 {
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int varNumero1;
        System.out.println("Ingrese dos numeros para obtener resultados:");
        varNumero1 = leer.nextInt(); 
        int varNumero2 = leer.nextInt(); 

       
        System.out.println("\nINGRESA una opcion(numero) para operar:"
                + "\n1.SUMA "
                + "\n2.RESTA"
                + "\n3.MULTIIPLICACION"
                + "\n4.DIVICION \n");
        
        
        int varRespuesta = leer.nextInt();
        switch (varRespuesta) { 
            case 1:
                System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS ES: " + FuncionSumar(varNumero1, varNumero2));
                break; 
            case 2:
                System.out.println("LA RESTA DE LOS NUMEROS INGRESADOS ES: " + FuncionRestar(varNumero1, varNumero2));
                 break;
            case 3:
                System.out.println("LA MULTIPLICACION DE LOS NUMEROS INGRESADOS ES: " + FuncionMultiplicar(varNumero1, varNumero2));
                 break;
            case 4:
                System.out.println("LA DIVISION DE LOS NUMEROS INGRESADOS ES: " + FuncionDividir (varNumero1, varNumero2));
                break;
           
        }



    }

    public static int FuncionSumar(int datoCualquiera1, int datoCualquiera2) {
        int varAuxiliar; 
        varAuxiliar = datoCualquiera1 + datoCualquiera2;
        return varAuxiliar;
    }

    public static int FuncionRestar(int x, int y) {
        return x - y;
    }

    public static int FuncionMultiplicar(int x, int y) {
        return x * y; 
     
}       
    public static int FuncionDividir (int x, int y) {
        return x / y; 
     
}       
}       

       
