
package problema5;
import java.util.*;

/**
 * @author franc
 */
public class Problema5 {


    public static void main(String[] args) {
        // TODO code application logic here
        int primo;
        primo=introducir();
        comprobar(primo);
    }
    
    public static int introducir(){
        int primo;
        System.out.println(" *** Calculadora de números primos ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        primo= teclado.nextInt();
        return primo;
    }
    
    public static void comprobar(int primo){
        int i=1;
        while(primo%i ==0){
            i++;
        }
        if(i==2){
            System.out.println("El número "+ primo+ " es primo");
        }else{
            System.out.println("El número "+ primo+ " NO es primo");
        }
    }
    
}
