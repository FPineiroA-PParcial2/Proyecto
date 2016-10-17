
package problema14;

/**
 * @author franc
 */
public class Problema14 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] tabla = new int [7][7]; //Se define el arreglo a 7x7
        llenarTabla(tabla);
     
    }
    
    public static void llenarTabla(int [][]t){ //Se evalua la posicon para mostrar un 1 cuando las coordenadas son iguales y 0 cuando no
        int i,j,k=0;
        for(i=0;i<7;i++){
            for(j=0;j<7;j++){
                if(i==j){
                    k=1;
                }else{
                    k=0;
                }
                System.out.print(k +"\t");
            }
            System.out.println("\n");
        }
        
    }
    
}
