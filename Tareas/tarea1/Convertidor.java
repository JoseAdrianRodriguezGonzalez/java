import java.util.Scanner;
public class Convertidor {
    public static Scanner scanf=new Scanner(System.in);

    public static void main(String[]args){
        //menu desplegable
        boolean flag=false;
        boolean flag2=false;
        do{
            flag=false;
            System.out.println("Menú de conversión: ");
            System.out.println("En que sistema numerico ingresa su dato");
            System.out.println("1.-Binario\n2.-Decimal\n3.-Octal\n4.-Hexadecimal\n5.-salir");
            System.out.println("Escoge un sisteme numerico");
            byte opcion=scanf.nextByte();
            String residuo=scanf.nextLine();
            String s;
            switch (opcion) {
                case 1:
                    s=captura();
                    for(int i=0;i<s.length();i++)
                        if(s.charAt(i)!='1'&&s.charAt(i)!='0'){
                            System.out.println("Es un número no valido");
                            flag=true;
                            break;
                        }
                    if(flag)
                        break;
                    System.out.println("A que numero desea convertir?");
                    System.out.println("1.-Binario\n2.-Decimal\n3.-Octal\n4.-Hexadecimal");
                    opcion=scanf.nextByte();
                    residuo=scanf.nextLine();
                    System.out.println(conversionBinaria(opcion,s));
                    break;
                case 2:
                    s=captura();
                    for(int i=0;i<s.length();i++)
                        if(s.charAt(i)<'0' ||s.charAt(i)>'9'){
                            System.out.println("Es un número no valido");
                            flag=true;
                            break;
                        }
                    if(flag)
                        break;
                    System.out.println("A que numero desea convertir?");
                    System.out.println("1.-Binario\n2.-Decimal\n3.-Octal\n4.-Hexadecimal");
                    opcion=scanf.nextByte();
                    residuo=scanf.nextLine();
                    System.out.println(conversionDecimal(opcion,s));
                    break;
                case 3:
                    s=captura();
                    for(int i=0;i<s.length();i++)
                        if(s.charAt(i)<'0' ||s.charAt(i)>'7'){
                            System.out.println("Es un número no valido");
                            flag=true;
                            break;
                        }
                    if(flag)
                        break;    
                    System.out.println("A que numero desea convertir?");
                    System.out.println("1.-Binario\n2.-Decimal\n3.-Octal\n4.-Hexadecimal");
                    opcion=scanf.nextByte();
                    residuo=scanf.nextLine();
                    System.out.println(conversionOctal(opcion,s));
                    break;            
                case 4:
                    s=captura();
                    for(int i=0;i<s.length();i++){
                    s=s.toLowerCase();
                        if((s.charAt(i)<'0' ||s.charAt(i)>'9')&&(s.charAt(i)<'a' ||s.charAt(i)>'f')){
                            System.out.println("Es un número no valido");
                            flag=true;
                            break;
                        }
                    }
                    if(flag)
                        break;
                    System.out.println("A que numero desea convertir?");
                    System.out.println("1.-Binario\n2.-Decimal\n3.-Octal\n4.-Hexadecimal");
                    opcion=scanf.nextByte();
                    residuo=scanf.nextLine();
                    System.out.println(conversionHexadecimal(opcion,s));
                    break;
                case 5:
                    flag2=true;
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("No es una respuesta valida");
                    break;
            }
        }while(!flag2);
    }   

    public static String captura(){
        System.out.println("Escriba su numero: ");
        String numero=scanf.nextLine();
        return numero;        
    }
    public static String conversionBinaria(byte opcion, String s){
        String resultante="";
        switch (opcion) {
            case 1:
                System.out.println("No se puede convertir de binario a binario");
                break;
            case 2:
                resultante=BinarioDecimal(s);
                break;
            case 3:
                resultante=BinarioOctal(s);
                break;
            case 4:
                resultante=BinarioHexadecimal(s);
                break;
        
            default:
                System.out.println("NO existe esa opción");
                break;
        }
        return resultante;
    }
    public static String conversionDecimal(byte opcion, String s){
        String resultante="";
        switch (opcion) {
            case 1:
                resultante=DecimalBinario(s);
                break;
            case 2:
                System.out.println("No se puede convertir de decimal a decimal");
                break;
            case 3:
                resultante=DecimalOctal(s);
                break;
            case 4:
                resultante=DecimalHexadecimal(s);
                break;
            default:
                System.out.println("No esta ese numero");
                break;
        }
        return resultante;
    }
    public static String conversionOctal(byte opcion, String s){
        String resultante="";
        switch (opcion) {
            case 1:
                resultante=OctalBinario(s);     
                break;
            case 2:
                resultante=OctalDecimal(s);
                break;
        
            case 3:
                System.out.println("No se puede convertir de octal a octal");
                break;
            case 4:
                resultante=OctalHexadecimal(s);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return resultante;
    }
    public static String conversionHexadecimal(byte opcion, String s){
        String resultante="";
        switch (opcion) {
            case 1:
                resultante=HexadecimalBinario(s);
                break;
            case 2:
                resultante=HexadecimalDecimal(s);
                break;
            case 3:
                resultante=HexadecimalOctal(s);
                break;
            case 4:
                System.out.println("No se puede convertir un número Hexadecimal a Hexadecimal");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
        return resultante;
    }


    //Binario
   public static String BinarioDecimal(String s){
        int num=0;
        for(int i=0;i<s.length();i++)
            if(s.charAt(s.length()-1-i)=='1')
                num+=Math.pow(2,i);
        return Integer.toString(num);     
   }
    public static String BinarioOctal(String s){
        String resultante="";
        while(s.length()%3!=0){
            s="0"+s;
        }
        String[] Octal={ "000", "001", "010", "011", "100", "101", "110", "111" };
            for(int i=0;i<s.length();i+=3){
                String subscadena=s.substring(i,i+3);
                for(int j=0;j<Octal.length;j++){
                    if(subscadena.equals(Octal[j])){
                        resultante+=j;
                    }
                }
            }
        return resultante;
    }
    public static String BinarioHexadecimal(String s){
        String resultante="";
        while(s.length()%4!=0){
            s="0"+s;
        }
        String[] hex={ "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111" ,"1000","1001","1010","1011","1100","1101","1110","1111"};
        char[] hexDigits={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'};
        for(int i=0;i<s.length();i+=4){
            String subscadena=s.substring(i,i+4);
            for(int j=0;j<hex.length;j++){
                if(subscadena.equals(hex[j])){
                    resultante+=hexDigits[j];
                }
            }
        }
        return resultante;
    }
    //Decimal
    public static String DecimalBinario(String s){
        int num=Integer.parseInt(s);
        String resultante="";
        while (num>0) {
            resultante=(num%2)+resultante;
            num/=2;
        }
        return resultante;
    }
    public static String DecimalOctal(String s){
        int num=Integer.parseInt(s);
        String resultante="";
        while (num>0) {
            resultante=(num%8)+resultante;
            num/=8;
        }
        return resultante;
    }
    public static String DecimalHexadecimal(String s){
        String resultante="";
        int num=Integer.parseInt(s);
        String hexMapa="0123456789ABCDEF";
        while (num>0) {
            resultante=hexMapa.charAt(num%16)+resultante;
            num/=16;
        }
        return resultante;
    }
    ///octal
    public static String OctalBinario(String s){
        String resultante="";
        String[] Octal={ "000", "001", "010", "011", "100", "101", "110", "111" };
        for(int i=0;i<s.length();i++){
            resultante+=Octal[s.charAt(i)-'0'];
        }
        return resultante;
    }
    public static String OctalDecimal(String s){ 
        int  num=0;
        for(int i=0;i<s.length();i++)
            num+=(s.charAt(s.length()-1-i)-'0')*Math.pow(8,i);                     
        return Integer.toString(num);
    }
    public static String OctalHexadecimal(String s){
        String Oct=OctalBinario(s);
        return BinarioHexadecimal(Oct);
    }
    //hexadecimal
    public static String HexadecimalBinario(String s){
        String resultante="";
        String[] Hex = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
            "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111" };
            for(int i=0;i<s.length();i++){
                resultante+=Hex[Character.digit(s.charAt(i), 16)];
            }
        return resultante;
    }
    public static String HexadecimalDecimal(String s){
        int  num=0;
        int decnum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(s.length()-1-i)>='0' &&s.charAt(s.length()-1-i)<='9')
                decnum=s.charAt(s.length()-1-i)-'0';
            else if(s.charAt(s.length()-1-i)>='a' &&s.charAt(s.length()-1-i)<='f')
                decnum=s.charAt(s.length()-1-i)-'a'+10;
            num+=decnum*Math.pow(16, i);
        }
        return Integer.toString(num);
    }
    public static String HexadecimalOctal(String s){
        String hexa=HexadecimalBinario(s);
        return BinarioOctal(hexa);
    }
}
