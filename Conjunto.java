import java.util.Scanner;

public class Conjunto {
    static float valores []=new float[5];
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Escriba 10 valores");
        for (int i=0; i<5;i++){
            int x=0;
            x++;
            System.out.println("Escriba el valor "+x);
            valores[i]=entrada.nextFloat();
        }
        imprimir(media(), suma());
    }
    public static float suma(){
        float suma=0;
        for (int i = 0; i < 5; i++) {
            float alma=valores[i];
            suma+=alma;
        }
        return suma;
    }
    public static float media(){
        float promedio=suma()/5;
        return promedio;
    }
    public static void imprimir(Float x,Float y){
        System.out.println("Esta es la suma"+y);
        System.out.println("Esta es la media"+x);
    }
}
