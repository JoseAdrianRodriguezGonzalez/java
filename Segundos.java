import java.util.Scanner;
public class Segundos {
    public static void  main(String [] args){
        Scanner escaneo=new Scanner(System.in);
        System.out.println("Escriba una cantidad de segundos ");
        int x=escaneo.nextInt();
        int minutos = x/60;
        int segundos=x%60;
        System.out.println("Esta es la cantidad de segundos que escribio: "+minutos);
        System.out.println("esta es la cantidad de segundos" +segundos);
    }
}
