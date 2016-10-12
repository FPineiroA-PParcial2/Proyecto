
package problema8;

import java.util.Scanner;

/**
 * @author franc
 */
public class Problema8 {

    public static void main(String[] args) {
        // TODO code application logic here
           System.out.println(" *** Calculadora de hipotenusas *** ");
        float a,b;
       a = solicitarDatos("Cateto a");
       b = solicitarDatos("Cateto b");
       mostrar(a,b);
         
        
        
    }
     public static float solicitarDatos(String tipo){
        float dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el: " + tipo);
        dato = teclado.nextFloat();
        return dato;
    }
    
     public static void mostrar(float a, float b){
       double resp;
       resp= Math.sqrt(Math.pow(a,2)+Math.pow(b, 2));
         System.out.println("La hipotenusa es: " + resp);
     }
    
}
