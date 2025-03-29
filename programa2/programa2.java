/*Programa Número 2 
 * Revisar el uso del tipo de dato String para el manejo de cadenas de caracteres.
 * String 
 * El tipo de dato String es una clase que se define en java para el manejo de cadenas de caracteres y se utiliza para el almacenamiento y manipulación de texto.
 * 
 * El tipo String en java se dice que es un tipo inmutable, que significa que una vez definido su contenido este no es modificable.
 * Sintacias para declarar un string es:
 * String Nombre; //Crea una variable de referencia
 * String Nombre=  "Esta es una cadena de texto" Crea una instaancia de un objeto tipo String
 * String nombre= new String("Hola uwu");
 *  */


 import java.util.Scanner;
import java.util.stream.Gatherer.Integrator;

import org.w3c.dom.Text;
 class string_p{
    static String texto1="Esta es una cadena de caracteres";
    public static void main(String[] arg){
        String Texto2;//variables de referencia, debe tener un valor por defecto, que es el null
        System.out.println(texto1);
        Scanner scanf=new Scanner(System.in);
        Texto2=scanf.nextLine();
        float Dpi=(float)6.28;
        String Texto4="2 pi="+String.valueOf(Dpi);//De esta mnaera no es necesario usar un string, sino solo la clase que me permita acceder
        System.out.println("Hola "+Texto2);
        System.out.println(Texto4);
//        int a=Integer.parseInt("uwu2");//esto no lo puede hacer, no puede separar estos valores que son caracteres+
        String a=scanf.nextLine();
        //valueOf es para devolver un objeto, y parseInt es para devolver el valor primitivo.
        int valor=Integer.parseInt(a); 
        System.out.println(valor+5);
        String Texto3=texto1.toUpperCase()+" "+Texto2.toLowerCase();
        char caracter;
        int k;
        System.out.println(Texto3);
        for(k=0;k<Texto3.length();k++){
            caracter=Texto3.charAt(k);
            System.out.print("("+caracter+")");
        }
        System.out.println("\n"+"Esta es una cadena".length());
    }
 }
