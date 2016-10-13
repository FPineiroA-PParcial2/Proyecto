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
    
    public static int pedirDato(){ //Se pide el año 
        int anyo;
        System.out.println(" *** Comprobar si es o no un año bisiesto ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el año: ");
        anyo = teclado.nextInt();
        return anyo;
    }
   public static void bisiesto(int anyo){ //Se calcula si es bisiesto o no
       
       if(anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0){ //Se divide entre 4, 100 y 400 para comprobar si es bisiesto
           System.out.println("El año es bisiesto :)");
       }
       else{
           System.out.println("El año NO es bisiesto :(");}
       }
               
   }
   
