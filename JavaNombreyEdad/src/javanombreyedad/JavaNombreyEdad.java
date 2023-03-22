
package javanombreyedad;

import java.util.Scanner;

/**
 *
 * @author Gallo_AK7
 */
public class JavaNombreyEdad {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("De cuantas personas va a ingresar datos");
        int varCantidad = leer.nextInt(); 

        String[] varArreglo1 = new String[varCantidad]; 
        int[] varArreglo2 = new int[varCantidad]; 
        cargarDatos(varArreglo1, varArreglo2, leer); 
        mostrarDatos(varArreglo1, varArreglo2, leer);
    }


    public static void cargarDatos(String[] vectorCualquiera1, int[] vectorCualquiera2, Scanner leer) {
        
        for (int i = 0; i < vectorCualquiera1.length; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1) + "/" + vectorCualquiera1.length);
            vectorCualquiera1[i] = leer.next();
            System.out.println("Ingrese la edad de la persona " + (i + 1) + "/" + vectorCualquiera2.length);
            vectorCualquiera2[i] = leer.nextInt();
        }
    }

    public static void mostrarDatos(String[] vectorCualquiera1, int[] vectorCualquiera2, Scanner leer) {
        String respuesta = "";
        do {
            for (int i = 0; i < vectorCualquiera1.length; i++) { 
                if (vectorCualquiera2[i] >= 18) {
                    System.out.println((vectorCualquiera1[i]).toUpperCase() + ", de edad:" + vectorCualquiera2[i] + ". Es mayor de edad");
                } else {
                    System.out.println(vectorCualquiera1[i] + ", de edad:" + vectorCualquiera2[i] + ". Es MENOR de edad");
                }

                if (i != vectorCualquiera1.length - 1) {
                    System.out.println("");
                    System.out.println("¿Mostramos la siguiente persona? SI / NO ");
                    respuesta = leer.next();
                    respuesta = respuesta.toUpperCase(); 
                } else {
                    System.out.println("NO HAY MAS DATOS PARA MOSTRAR");
                    respuesta = "NO";
                }
            }
        } while (("SI".equals(respuesta)));
    }
    
}
