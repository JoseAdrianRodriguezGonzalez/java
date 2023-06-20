import java.util.Scanner;

public class Sistema_de_ecuaciones{
    public static void main(String [] args){
        Scanner entrada =new Scanner(System.in);
        System.out.println("Resolucion de sistemas de ecuaciones\n Inserte los coeficientes:");
        System.out.println("A:");
        float a=entrada.nextFloat();
        System.out.println("B:");
        float b=entrada.nextFloat();
        System.out.println("C:");
        float c=entrada.nextFloat();
        System.out.println("D:");
        float d=entrada.nextFloat();
        System.out.println("E:");
        float e=entrada.nextFloat();
        System.out.println("F:");
        float f=entrada.nextFloat();
        float x=((c*e)-(b*f))/((a*e)-(b*d));
        float y=((a*f)-(c*d))/((a*e)-(b*d));
        System.out.println("Estos son los valores de X:"+x);
        System.out.println("Estos son los valores de Y:"+y);
        
    }

}