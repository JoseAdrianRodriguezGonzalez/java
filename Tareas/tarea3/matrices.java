//package Tareas.tarea3;
import java.util.Scanner;
public class matrices {
    public static void main(String[] args) {
        int[][] M=null;
        System.out.print("Deme una cantidad de filas=");
        int filas=Captura();
        System.out.print("Deme una cantidad de columnas=");
        int columnas=Captura();
        M=ConstruccionMatriz(filas, columnas);
        System.out.println("Matriz original: ");
        Imprimir(M);
        System.out.println("Matriz transpuesta: ");
        Imprimir(Transpuesta(M));
        System.out.println("Matriz Superior: ");
        Imprimir(MatrizSuperior(M));
        System.out.println("Matriz Inferior");
        Imprimir(MatrizInferior(M));

    }
    public static int Captura(){
        Scanner scanf=new Scanner(System.in);
        int num=scanf.nextInt();
        return num;
    }
    public static int[][] ConstruccionMatriz(int filas, int columnas){
        Scanner scanf=new Scanner(System.in);
        int[][] Matriz=new int[filas][columnas];
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("["+i+"]"+"["+j+"]"+"=");
                Matriz[i][j]=scanf.nextInt();
                System.out.println("");
            }
        }
        return Matriz;
    }
    public static void Imprimir(int[][] Matriz){
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[0].length; j++) 
                System.out.print(Matriz[i][j]+(j<Matriz[0].length-1?",":""));
        System.out.println("");
        }
    }
    public static int[][] Transpuesta(int[][] Matriz){
        int [][] AuxMatriz=new int[Matriz[0].length][Matriz.length];
        for(int i=0;i<Matriz.length;i++){
            for(int j=0;j<Matriz[0].length;j++){
                AuxMatriz[j][i]=Matriz[i][j];
            }
        }
        return AuxMatriz;
    }
    public static int[][] MatrizSuperior(int[][] Matriz){
        int[][] M=Transpuesta(Matriz);
        int[][] MatrizSuperior=new int[M.length][M[0].length];
        for (int i = 0; i < MatrizSuperior.length; i++) 
            for (int j = 0; j < MatrizSuperior[0].length; j++) 
                MatrizSuperior[i][j]=(i<=j)?M[i][j]:0;
        return MatrizSuperior;
    } 
    public static int[][] MatrizInferior(int[][] Matriz){
        int[][] M=Transpuesta(Matriz);
        int[][] MatrizSuperior=new int[M.length][M[0].length];
        for (int i = 0; i < MatrizSuperior.length; i++) 
            for (int j = 0; j < MatrizSuperior[0].length; j++) 
                MatrizSuperior[i][j]=(j<=i)?M[i][j]:0;
        return MatrizSuperior;
    }
}
