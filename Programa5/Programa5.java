/**Programa 5
 * 
 * Implementar un programa que capture dos matrices de números enteros y calcule su producto
 */
import java.util.Scanner;
public class Programa5 {
    static Scanner scfanf=new Scanner(System.in);
    public static void main(String[] args){
        int [][] A,B,C;
        System.out.println("Deme dos matrices para multiplicar\n De que tamaño es la matriz A? ");
        int N,M;
        System.out.println("Columnas= ");
        N=scfanf.nextInt();
        System.out.println("Filas= ");
        M=scfanf.nextInt();
        A=captura(N, M);
        imprimir(A);
        System.out.println("Columnas= ");
        N=scfanf.nextInt();
        System.out.println("Filas= ");
        M=scfanf.nextInt();
        B=captura(N, M);
        imprimir(B);
        C=multiplicacion(A, B);
        System.out.println("A*B=");
        imprimir(C);
    }
    public static int[][] captura(int N,int M){
        int[][] matriz=new int [M][N];
        for(int i=0;i<M;i++)
            for(int j=0;j<N;j++){
                System.out.println("dato["+i+"]"+"["+j+"]=");
                matriz[i][j]=scfanf.nextInt();
            }
        return matriz;
    }
    public static void imprimir(int[][] matriz){
        for(int i=0;i<matriz.length;i++){  //filas
            System.out.print("[");
            for(int j=0;j<matriz[0].length;j++){//columnas
                System.out.print(matriz[i][j]+",");
            }
            System.out.print("]");
        System.out.println("\n");    
        }
    }
    public static int [][] multiplicacion(int[][]A,int [][]B){
        int[][] mat=null;
        if(A[0].length==B.length){
            mat=new int [A.length][B[0].length];
            for(int i=0;i<A.length;i++){ //columna
                for(int j=0;j<B[0].length;j++){//columna
                    for(int k=0;k<A[0].length;k++){
                        mat[i][j]+=A[i][k]*B[k][j];
                    }
                }
            }
            return mat;
        }else{
            System.out.println("No se puede realiza el producto");
        }
        return null;
    }
}
