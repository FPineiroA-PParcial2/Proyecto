
package problema7;
import java.util.*;

/**
 * @author franc
 */
public class Problema7 {

    public static void main(String[] args) {
        // TODO code application logic here
        float vel;
        vel=solicitarDato();
        mostrar(vel);
    }
    
    public static float solicitarDato(){ //Se piden los kilometros por hora a ser convertidos
        System.out.println(" *** Convertidor de km/h a m/s *** ");
        float vel;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la velocidad que deaseas convertir: ");
        vel = teclado.nextFloat();
        return vel;
    }
    public static void mostrar(float vel){ //Se hace el calculo para convertira  metros sobre segundo
        float ms;
        ms=vel*1000/3600;
        System.out.println(vel+" km/h es " +ms+ " m/s"); //Se muestra el resultado
        
    }
    
}
