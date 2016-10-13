
package problema2;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Problema2 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        double metro;
        metro = pedirDato();
        mostrar(metro);
        
    }
    
    public static double pedirDato(){ //Se solicita el dato para ser convertido
        double metro;
        System.out.println("*** Convertidor de metros a pies, millas y yardas *** ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la cantidad que desea convertir: ");
       metro = teclado.nextDouble();
        return metro;
    }
    
    public static void mostrar(double metro){ //Se hace la conversion y se muestra el resultado
        double pie,milla,yarda;
        pie = metro * 3.28084;
        milla = metro * 5280;
        yarda = metro * 3;
        System.out.println(metro + " metros es " + pie +" pies");
        System.out.println(metro + " metros es " + milla +" millass");
        System.out.println(metro + " metros es " + yarda +" yardas");
        
    }
}
