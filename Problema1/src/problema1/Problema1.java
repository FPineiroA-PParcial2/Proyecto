package problema1;
import java.util.*;
/**
 * @author franc
 */
public class Problema1 {

    public static void main(String[] args) {
        // TODO code application logic here
       int anyo;
       anyo =pedirDato();
       bisiesto(anyo);
      
    }
    
    public static int pedirDato(){
        int anyo;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año: ");
        anyo = teclado.nextInt();
        return anyo;
    }
   public static void bisiesto(int anyo){
       
       if(anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0){
           System.out.println("El año es bisiesto :)");
       }
       else{
           System.out.println("El año NO es bisiesto :(");}
       }
               
   }
   
