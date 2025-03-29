/*Programa que convierta unnúmero binario a decimal */
import java.util.Scanner;
public class programa3 {
    public static void main(String[] args){
        boolean valido=true;
        String BinaryNumber=null;
        do{
            valido=true;
            Scanner scanf=new Scanner(System.in);
            System.out.println("Dime un número binario: ");
            BinaryNumber=scanf.nextLine();
            for(int k=0;k<BinaryNumber.length();k++){
                if((BinaryNumber.charAt(k)!='0') &&(BinaryNumber.charAt(k)!='1') ){
                    valido=false;
                    System.out.println("Error, no es un número binario");
                    break;
                }
            }
        }while(!valido);
        System.out.println(BinarytoDecimal(BinaryNumber));

    }
    public static int BinarytoDecimal(String binary){
        int numero=0;
        for(int i=0;i<binary.length();i++){
            numero=numero*2+(binary.charAt(i)-'0');
        }
        return (int) numero;
    }
    ///Por corrimiento 
    /// for(int i=0;i<binary.length();i++){
    ///     
    /// }
}
