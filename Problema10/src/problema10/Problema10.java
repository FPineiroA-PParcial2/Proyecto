
package problema10;
import java.util.*;

/*
 * @author franc
 */
public class Problema10 {

    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        num = pedirNum();
        fibonacci(num);
    }
    
    public static int pedirNum(){ //Se pide el numero, siendo mayor a uno
        int num;
        System.out.println(" *** Sucesión Fibonacci *** ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de posiciones a mostrar: ");
        num = teclado.nextInt();
        if(num<2){
            System.out.println("El numero debe ser mayor a 1");
            pedirNum();
        }
        return num;
    }
    
    public static void fibonacci (int num){ //Se calcula la sucesion Fibonacci
        int f1=1,f2=1,i;
        System.out.println("Los primeros " + num+"digitos de la serie Fibonacci son: ");
        System.out.print(f1 +" ");
        for(i=2;i<num;i++){
            System.out.print(f2 +" ");
            f2=f1+f2;
            f1=f2-f1;
        } 
        System.out.println("");
    }
}
