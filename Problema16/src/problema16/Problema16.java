package problema16;
import java.util.*;
/**
 * @author franc
 */
public class Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" ***Calcula el numero mayor *** ");
        int a,b,c;
        a=pedirNumero("primer");
        b=pedirNumero("segundo");
        c=pedirNumero("tercer");
        mostrarMayor(a,b,c);
    }
    
    public static int pedirNumero(String dato){  //Se piden los datos 
        int n;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el " +dato+" numero:");
        n=teclado.nextInt();
        return n;
    }
    public static void mostrarMayor(int a, int b, int c){  //Se evalua que numero es mayor
        int mayor;
        mayor = a;
        if(mayor<b){
            mayor=b;
        }
        if(mayor<c){
            mayor=c;
        }
        System.out.println("El numero mayor es: " +mayor); //Se muestra el numero mayor
    }
}
