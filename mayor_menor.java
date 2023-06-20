import java.util.Scanner;

public class mayor_menor {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("Escriba 3 numeros");
        int x=entrada.nextInt();
        int y=entrada.nextInt();
        int z=entrada.nextInt();
        mayor(x,y,z);
        menor(x,y,z);
    }
    public static void mayor(int x, int y ,int z){
        if(x>y&&x>z){
            System.out.println("X es mayor");
        }
        else if(y>z){
            System.out.println("Y es mayor");
        }
        else{
            System.out.println("Z es mayor");
        }
    }
    public static void menor(int x, int y ,int z){
        if(x<y&&x<z){
            System.out.println("X es menor");
        }
        else if(y<z){
            System.out.println("Y es menor");
        }
        else{
            System.out.println("Z es menor");
        }
    }
}
