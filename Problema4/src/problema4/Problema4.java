
package problema4;
import java.util.*;
/**
 * @author franc
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float far;
        far = pedirDato();
        resultado(far);
    }
    
    public static float pedirDato(){ //Se pide la temperatura a convertir
        float far;
        System.out.println(" *** Calculadora de grados °F a partir de °C ***");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número que deseas convertir: ");
        far = teclado.nextFloat();
        return far;
    }
    
    public static void resultado(float far){ //Se hace la conversion de °C a °F
        float respuesta;
        respuesta = far*(9/5) + 32;
        System.out.println(far+"°C en farenheit es "+ respuesta +"°F"); //Se muestra el resultado
    }
}
