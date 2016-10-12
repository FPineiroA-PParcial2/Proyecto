
package problema7;
import java.util.*;

/**
 * @author franc
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float vel;
        vel=solicitarDato();
        mostrar(vel);
    }
    
    public static float solicitarDato(){
        System.out.println(" *** Convertidor de km/h a m/s *** ");
        float vel;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la velocidad que deaseas convertir: ");
        vel = teclado.nextFloat();
        return vel;
    }
    public static void mostrar(float vel){
        float ms;
        ms=vel*1000/3600;
        System.out.println(vel+" km/h es " +ms+ " m/s");
        
    }
    
}
