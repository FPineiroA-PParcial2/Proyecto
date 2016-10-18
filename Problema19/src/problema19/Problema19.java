
package problema19;
import java.util.*;

/**
 * @author franc
 */
public class Problema19 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*** Calculadora de seno, coseno y tangente de un angulo *** ");
        double ang;
        ang=pedirDato();
        funciones(ang);
        
    }
    public static double pedirDato(){ //Se pide el angulo que se desea analizar
        double ang;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el angulo que deseas analizar: ");
        ang= teclado.nextDouble();
        return ang;
    }
    public static void funciones(double ang){ //Se calcula y se muestra el resultado
        double rad = Math.toRadians(ang);
        System.out.println("El seno de "+ang+" es: "+ Math.sin(rad));
        System.out.println("El coseno de "+ang+" es: "+ Math.cos(rad));
        System.out.println("La tangente de "+ang+" es: "+ Math.tan(rad));
    }
    
}
