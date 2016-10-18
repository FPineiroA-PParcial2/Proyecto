
package problema12;
import java.util.*;

/**
 * @author franc
 */
public class Problema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" *** Calcula la media de posiciones pares *** ");
        int []arreglo = new int [10];
        arreglo=pedirDatos(arreglo);
        mostrar(arreglo);
    }
    
    public static int[] pedirDatos(int []a){
        int i=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero: "); //Se piden los datos
        while(i<a.length){
            a[i]=teclado.nextInt();
            i++;
        }
        return a;
    }
    
    public static void mostrar(int[] a ){
        int n1=0,n2=0;
        for(int i=1; i<a.length;i+=2){  //Se hace la suma de las posiciones pares y el recorrido del arreglo
            n1= a[i]+n1;
            n2++;
        }
        n1=n1/n2;
        System.out.println("El promedio de las posiciones pares es: "+n1); //Se muestra el promedio
    }
}
