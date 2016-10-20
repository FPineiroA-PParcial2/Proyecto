package problema15;
import java.util.Random;

/**
 
 * @author franc
 */
public class Problema15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] tabla = new int[11][11]; //Se hace el arreglo para que contenga los numeros(10x10) y el resultado
        llenarTabla(tabla);
        mostrar(tabla);
    }
    
    public static int[][] llenarTabla(int[][] t){
        int i,j,s;
        Random numAleatorio = new Random();
        for(i=0;i<t.length;i++){
        for(j=0;j<t.length;j++){
                if(j==10){
                    s=0;
                    for(j=0;j<t.length-1;j++){
                        s= t[i][j]+s;
                    }
                    t[i][j]=s;
                }else{
                    t[i][j]= numAleatorio.nextInt(10+1);
                }
                if(i==10){
                    s=0;
                    for(i=0;i<t.length-1;i++){
                    s= t[i][j]+s;
                }
                    t[i][j]= s;
            }
        }
    }
   return t;
}
    
    public static void mostrar(int[][] t){
        for(int i=0; i<t.length;i++){
            for(int j=0;j<t.length;j++){
                if(i<11 && j<11){
                    System.out.print(t[i][j]+"\t");
                }
            }
            System.out.println("\n");
        }
        
        
    }
}