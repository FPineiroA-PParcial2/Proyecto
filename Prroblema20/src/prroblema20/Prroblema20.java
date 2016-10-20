
package prroblema20;
import java.util.*;

/**
 * @author franc
 */
public class Prroblema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        n1=pedirNum("primer");
        n2=pedirNum("segundo");
        amigos(n1,n2);
    }
    
    public static int pedirNum(String dato){
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el "+dato+" numero: ");
        return num = teclado.nextInt();
    }
    
    public static void amigos(int n1, int n2){
        int i=1,j=1,s1=0,s2=0;
        for(i=1;i<n1;i++){
            if(n1%i==0){
                s1= i+s1;
            }
        }
        for(j=1;j<n2;j++){
            if(n2%j==0){
                s2=j+s2;
            }
        }
        if(s2==n1 &&s1==n2){
            System.out.println(n1+" y "+n2+ " son numeros amigos.");
        }else{
            System.out.println(n1+" y "+n2+" NO son numeros amigos.");
        }
    }
    
}
