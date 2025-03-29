import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
class Programa9{
    public static void main(String[] args){
        Scanner scanf=new  Scanner(System.in);
        String Texto;
        int Entero;
        Double doble;
        Texto="Esta es una linea de texto de ejemplo";
        Entero=5050;
        doble=6.28;
        try{
            FileWriter archivo=new FileWriter("Salida.txt",true);
            PrintWriter Escribe=new PrintWriter(archivo);
            System.out.println("Escribe una cadena");
            Texto=scanf.nextLine();
	    for(int i=0;i<5;i++){
		Escribe.println("Es es la linea numero"+2*i);
            }
            Escribe.println(3*Entero);
	    Escribe.println(doble);
            Escribe.println(Texto);
            Escribe.close();
        }catch(Exception ex){
            System.out.println(Texto);            
        }
    }
    
}

        //Escribe una cadena
//Esta es una linea de texto de ejemplo
//Escribe una cadena