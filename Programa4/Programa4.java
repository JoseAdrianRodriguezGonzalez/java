//implementar un programa que caputre un vecotr de datos enteros y calcule el promedio
import java.util.Scanner;
public class Programa4{
    public static Scanner scanf=new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Cuantos elementos desea? ");
        int cantidad=scanf.nextInt();
        if(cantidad<0){
            System.out.println("No puedes colocar numeros negativos");
        }
        int[] arreglo=Captura(cantidad);
        Imprimir(arreglo);
        System.out.println("\nEl promedio es: "+promedio(arreglo));
    }
    public static int[] Captura(int cantidad){
        int[]arreglo=new int[cantidad];
        for(int i=0;i<cantidad;i++){
            System.out.print("dato["+i+"]=");
            arreglo[i]=scanf.nextInt();
        }
        return arreglo;
    }
    public static void Imprimir(int[] arreglo){
        System.out.print("[");
        for(int i=0;i<arreglo.length;i++){
            if(i==arreglo.length-1){
                System.out.print(arreglo[i]);
                break;
            }
                System.out.print(arreglo[i]+",");
        }
        System.out.print("]");
    }
    public static float promedio(int[]arreglo){
        float sum=0;
        for(int i=0;i<arreglo.length;i++)
            sum+=arreglo[i];
        return sum/(arreglo.length);
    }
}