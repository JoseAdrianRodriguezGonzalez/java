import java.util.Scanner;
public class Inversor {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String cadena;
        System.out.print("Escribe un string:\n");
        cadena=scan.nextLine();
        String[] cadenInvetida=stringInversor(cadena);
        for(int i=0;i<cadenInvetida.length;i++){
            System.out.print(cadenInvetida[i]+" ");
        }
    }
    public static String[] stringInversor(String s){
        String[] inversa=s.split(" ");
        for(int i=0;i<inversa.length;i++){
            inversa[i]=Invertido(inversa[i]);
        }
        return inversa;
    }
    public static String Invertido(String s){
        char[] t=new char[s.length()];
        for(int i=0;i<s.length();i++){
            t[i]=s.charAt(s.length()-1-i);
        }
        return new String(t);
    }
}