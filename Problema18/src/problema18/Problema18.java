
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
       int a,b,c,min;
        a=pedirDato("primer");    
        b=pedirDato("segundo");
        c=pedirDato("tercer");
        min=mini(a,b,c);
        mostrar(min);
            
        
    }
    
    public static int pedirDato(String num){  //Se piden los numeros a ser analizados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el "+ num+" numero: ");
        int nu;
        return nu=teclado.nextInt();
 
    }
    
   public static int mini (int a, int b, int c){
            int min=1,m;
        m=a;
        if(m<b)m=b;
        if(m<c)m=c;
        for (int i=2;i<m;i++){
            if (a%i==0||b%i==0||c%i==0){
                min=min*i;
                if (a%i==0) a=a/i;
                if (b%i==0) b=b/i;
                if (c%i==0) c=c/i;
            }
        }
        return min;
    }
   
   public static void mostrar(int min){
       System.out.println("El MCM es: "+min);
   }
   }
    
 
    

