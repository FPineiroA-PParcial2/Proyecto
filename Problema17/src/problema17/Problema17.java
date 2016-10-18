
package problema17;
import java.util.*;

/**
 * @author franc
 */
public class Problema17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*** Calcular el minimo comun divisor *** ");
        int a,b,r;
        a=pedirDato("primer");
        b=pedirDato("segundo");
        calcular(a,b);
    }
    
    public static int pedirDato(String nu){
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el "+nu+" numero: ");
        return num = teclado.nextInt();
    }
    
    public static void calcular(int a, int b){
        int r;
        if(b==0){
            r=a;
        } else{
            r=a%b;
        }
        System.out.println("El minimo comun divisor de "+a+" y "+b+" es: "+r);
    }
            
}
