
package problema9;
import java.util.*;
/**
 * @author franc
 */
public class Problema9 {


    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        num = dato();
        mostrar(num);
    }
    
    public static int dato(){
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número que deseas analizar: ");
        num = teclado.nextInt();   //Se pide el numero por analizar
        return num;
    }
    
    public static void mostrar(int num){
       for( int i=10;i<num*10;i=i*10){         
           System.out.print(((num%i)/(i/10))*(i/10));
           if((i<num))System.out.print(" + ");
       }
        System.out.print("\n");
        
    }
    }

