
package problema13;
import java.util.*;

/**
 * @author franc
 */
public class Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []arreglo = new int[30];
        int promedio,mayorProm;
        arreglo=llenarArreglo(arreglo);
        promedio=promedioArreglo(arreglo);
        arribaProm(arreglo,promedio);
    }
    
    public static int[] llenarArreglo(int[] a){ //Se piden los datos para llenar el arrelo
        Scanner teclado = new Scanner(System.in);
        for(int i =0; i<a.length;i++){
            System.out.println("Introduce el numero de la posicion ["+i+"] : ");
            a[i]= teclado.nextInt();
        }
        return a;
    }
     public static int promedioArreglo(int[] a){ //Se calcula el promedio de los numeros
         int j=0,k=0, promedio;
         for(int i=0;i<a.length;i++){
             j=a[i]+j;
             k++;
         }
         promedio=j/k;
         System.out.println("El promedio de los numeros es: "+ promedio);
         return promedio;
     }
     public static void arribaProm(int[] a,int promedio){ //Se calculan los numeros por encima y por debajo del promedio
         int sup=0;
         for(int i=0;i<a.length;i++){
             if(a[i]>promedio){
                 sup++;
             }
         }
         System.out.println("La cantidad de numeros superiores al promedio es: "+ sup);
         System.out.println("La cantidad de numeros inferiores al promedio es: "+(a.length-sup));
     }
     
}
