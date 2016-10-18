
package problema18;
import java.util.*;
/**
 * @author franc
 */
public class Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*** Calcular el minimo comun multiplo de dos numeros *** ");
       int a,b;
        a=pedirDato("primer");    
        b=pedirDato("segundo");
        mCm(a,b);
    }
    
    public static int pedirDato(String num){  //Se piden los numeros a ser analizados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el "+ num+" numero: ");
        int nu;
        return nu=teclado.nextInt();
 
    }
    public static void mCm(int a, int b){ //Se calcula el MCM
        int min,mcm=0;
        min=Math.min(a, b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                int mcd=i;
                mcm=(a*b)/mcd;
            }
        }
        System.out.println("El minimo comun multiplo de "+a+" y "+b+" es: "+mcm); //Se muestra el MCM
    }
    
}
