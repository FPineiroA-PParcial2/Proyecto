
package problema.pkg3;
import java.util.Scanner;

/**
 * @author franc
 */
public class Problema3 {

    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        num = pedirNum();
        mostrar(num);
    }
    
    public static int pedirNum(){ //Se pide el numero para ser comprobado
        int num;
        System.out.println(" *** Calculadora de números factoriales ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número que desea calcular: ");
        num = teclado.nextInt();
        return num;
    }
    public static void mostrar(int num){ //Se hace la operacion para obtener el factorial
        int factorial = 1;
    for(int i = num; i>0;i--){
        factorial = factorial * i;
    }
        System.out.println("El factorial de " + num+ " es: "+factorial); //Se muestra el resultado
    }
    
}
