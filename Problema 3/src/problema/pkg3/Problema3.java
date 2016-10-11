
package problema.pkg3;
import java.util.Scanner;

/**
 * @author franc
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        num = pedirNum();
        mostrar(num);
    }
    
    public static int pedirNum(){
        int num;
        System.out.println(" *** Calculadora de números factoriales ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número que desea calcular: ");
        num = teclado.nextInt();
        return num;
    }
    public static void mostrar(int num){
        int factorial = 1;
    for(int i = num; i>0;i--){
        factorial = factorial * i;
    }
        System.out.println("El factorial de " + num+ " es: "+factorial);
    }
    
}
