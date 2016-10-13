
package problema6;
import java.util.*;
/**
 * @author franc
 */
public class Problema6 {

    public static void main(String[] args) {
        // TODO code application logic here
        int hora;
        float sueldo;
        hora = pedirHoras();
        sueldo = pedirSueldo();
        calcularSueldo(hora,sueldo);
    }
    
    public static int pedirHoras(){ //Se pide que se introduzcan las horas trabajadas
        int hora;
        System.out.println(" *** Calculadora de sueldo semanal *** ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas: ");
        hora = teclado.nextInt();
        return hora;
    }
    public static float pedirSueldo(){  //Se pide que se introduzca el saldo por hora
        float sueldo;
         Scanner teclado = new Scanner(System.in);
         System.out.println("Introduce la paga por hora: ");
        sueldo= teclado.nextFloat();
        return sueldo;
    }
    public static void calcularSueldo(int hora, float sueldo){  //Se calcula el sueldo tomando en cuenta las condiciones establecidas
        float respuesta = 0;
        if(hora<=40){
            respuesta =hora*sueldo;
        }if(hora>40 && hora<48){
            respuesta= (40*sueldo)+(hora-40)*sueldo*2 ;
        } if(hora>48){
            respuesta=(40*sueldo)+(8)*(sueldo*2)+(hora-48)*(sueldo*3);
        }
        
        System.out.println("El sueldo ganado es de: " + respuesta);   //Se muestra el sueldo ganado
    }
    
}
