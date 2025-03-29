/*Programa No.11
"Cmposcion de clases
Ejercicio
Crear una clase para el maneo de matrice de nuermos complejos. Que contnega ls siguiente meetodos:
1.emtdos de captura
2.METODO PARA IMPRIMI EN PANTALL
3. Metoodo para calclar el ´roducto de dos amtrices complejas,.
*/
import java.util.Scanner;
class MatrizCompleja{
    //Lista de atributos
    private Complejo[][]Mc;
    MatrizCompleja(){
        Mc=null;
    }
    MatrizCompleja(int filas,int cols){
        Mc=new Complejo[filas][cols];
        int i,j;
        for(i=0;i<Mc.length;i++)
            for(j=0;j<Mc[0].length;j++)
                Mc[i][j]=new Complejo();
    }
    public void crear(int filas, int cols){
        Mc=new Complejo[filas][cols];
        int i,j;
        for(i=0;i<Mc.length;i++)
            for(j=0;j<Mc[0].length;j++)
                Mc[i][j]=new Complejo();

    }
    public void Inicializar(float re,float im){
        int i,j;
        for(i=0;i<Mc.length;i++)
            for(j=0;j<Mc[0].length;j++)
                Mc[i][j]=new Complejo(re,im);
        
    }
    public void mostrar(){
        int i,j;
        if(Mc!=null)
        for(i=0;i<Mc.length;i++){
            for(j=0;j<Mc[0].length;j++){
                
                Mc[i][j].Show();
                System.out.print(" ");
            }
            System.out.println("");
        }
        else
            System.out.println("Matriz vacía");

    }
    public void Captura(){
        int i,j;
        for(i=0;i<Mc.length;i++){
            System.out.println("");
            for(j=0;j<Mc[0].length;j++){
                System.out.println("dato"+"["+i+"]"+"["+j+"]");
                Mc[i][j].Captura();
            }
        }

    }
    public MatrizCompleja Por(MatrizCompleja B){
        MatrizCompleja M=new MatrizCompleja();
        Complejo aux=new Complejo();
        if(Mc[0].length==B.Mc.length){
            M.crear(Mc.length,B.Mc[0].length);
            for(int i=0;i<Mc.length;i++){
                for(int j=0;j<B.Mc[0].length;j++){
                    for(int k=0;k<Mc[0].length;k++){
                       aux.Producto(Mc[i][k],B.Mc[k][j]);
                        M.Mc[i][j].Suma(aux);
                    }
                }
            }
        }
        return M;
    }
}//Fin de la clase matriz compleja
public class Programa11 {
   public static void main(String[]x){
    Scanner scanf = new Scanner(System.in);
    MatrizCompleja A=new MatrizCompleja();
    MatrizCompleja B=new MatrizCompleja();
    MatrizCompleja C=new MatrizCompleja();
    System.out.println("NUmero de filas de la matriz A: ");
    int filas=scanf.nextInt();
    System.out.println("NUmero de columnas de la matriz A: ");
    int columnas=scanf.nextInt();
    A.crear(filas, columnas);
    A.Captura();
    System.out.println("NUmero de filas de la matriz B: ");
    filas=scanf.nextInt();
    System.out.println("NUmero de columnas de la matriz B: ");
    columnas=scanf.nextInt();
    B.crear(filas, columnas);
    B.Captura();
    
    
    A.mostrar();
    B.mostrar();


    //Clauclar el producto de A*B
    C=A.Por(B);
    C.mostrar();
   } 
}//