import java.util.Scanner;
public class excepciones {
    public static void main(String[] args){
        Scanner scanf=new Scanner(System.in);
        float a,b,resultado;
        System.out.print("Dame dos numeros");
        a=scanf.nextFloat();
        b=scanf.nextFloat();
        int [] arreglo=new int[2];
        int[] ueu=null;
    try{
        resultado=dividir(a, b);
        ueu[2]=1;
        arreglo[3]=2;    
        System.out.println(a+"/"+b+"="+resultado);
    }
    catch(ArrayIndexOutOfBoundsException ex){
        System.out.println(ex.getMessage());
        System.out.println("No se pede obtener ese numero");
    }
    catch(NullPointerException ex){
        System.out.println(ex.getMessage());
        System.out.println("Fuere de rango");
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
            System.out.println(ex.getClass());//Excepion que ocurrio
            //No llega aquí si ya fue anteriormente capturada
        }//El mensaje de error localn, indica el tipo de variable y el número de variable o linea en la que esta.
        
    }
    public static float dividir(float a, float b)throws Exception{
        if(b!=0) return a/b;
        else
            throw new Exception("No se puede dividr entre cero");
    }    
}    

