import java.util.Scanner;

class App{
    public static void main(String [] args){
        Scanner entrada =new Scanner(System.in);
        int x=entrada.nextInt(),y=entrada.nextInt();
        int resultado=x/y;
        System.out.println("El resultado es:"+resultado);
         x=entrada.nextInt();
         y=entrada.nextInt();
         resultado=x%y;
        System.out.println("El resultado es:"+resultado);
        

    }
}
