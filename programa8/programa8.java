//Programa 8
//Lectura de archivos
import java.util.Scanner;
import java.io.File;
public class programa8 {
    public static void main(String[] args){
        //Scanner scanf=new Scanner(System);
        String linea;
        File archivo;//variable de referencia
        int Entero;
        float Real;
        boolean bandera;
        try {
           String Linea;
            archivo=new File("texto.txt");
            Scanner scanf=new Scanner(archivo);
           // for (int i=0;i<5;i++) {
            //    linea=scanf.nextLine();
            //    System.out.println(linea);                
            //}
           /* */
           
            bandera=scanf.nextBoolean();
           System.out.println(bandera);
           // for(int i=0;i<Entero;i++){
            //    Linea=scanf.nextLine();
           //     System.out.println(Linea);
          // }
/*             Real=scanf.nextFloat();
            bandera=scanf.nextBoolean();
            System.out.println(Entero+"*"+Real+"="+Entero*Real);
            System.out.println("Bandera="+bandera);
            while(scanf.hasNextLine()){
                linea=scanf.nextLine();
                System.out.println(linea);                
            }
*/
            scanf.close();
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            // TODO: handle exception
        }
    }
}//Fin de la clase principal
