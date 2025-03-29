class HolaMundo{
    //static exista la funcion a pesar que no este instanciada la clase
    public static void main(String args[]){
        System.out.println(sume(1,2));
        operacionBi();
        for(int i=0;i<8;i++)
            System.out.println(fibon(i));
    }public static int sume(int a,int b){
        return a+b;
    }
    public static void operacionBi(){
        byte a=2;
        byte b=3;
        byte c=5;
         //>> a la derecha
    }
    public static int fibon(int z){
        int y=0,x=1,count=0;
        while(count<z){
            int aux=x;
            x+=y;
            y=aux;
            count++;
        }
        return x;
    }
}//La llave de cierra FIN
//se puede forzar la logica con | para que los dos operadores se realicen
//instanceof permite saber si una objeto pertenece a la clase o no

/// parentesis
///En java los operadores con mayor precedencia son ++exper,--expre,-expre,~,!, operadores unarios
/// //multiplicacion, division modulo
/// //sumas y restas
/// corrimientos de bits
/// relacionales,< > >= <= instan of
//iguald == !=
// bitwise AND &
// biwise XOR ^
//bitwise OR |
// logical and &&
/// logical OR ||
/// conditional ? :
/// assignmente =, +=,-=
/// final es la palabra reservada para java para decir que una vairable es constante
/// Si es static se puede agregar a traves de la constante
/// valores literales Al a hora de trtatar con valores delos tipos de daots simples, se utiliza lo que se denomina liertales.
/// Los listerales son elementos que siven para representar un valor en el c´digo fuente del programa
/// Logicos (boolena)
/// carácterchar
/// etneros byte, short int y long
/// De los tipos entero se pueden representar como valores decimales en decimal, octal o hexadecimal
/// para las variables longo, deve de añadir el vaalor la letra L para indicar que el entero se considera como long 
/// para indicar que es octal es seguido cn el valor 0 y hexadecimal 0x
/// /// Reales double y float
/// Cadenas de caracteres string
///  booln activado=false o ture
/// long max1=34L;
/// long max2=042L;
/// long max3=0x22L
/// 
/// 
/// Los valorees reales float y double no se puedene expresar en terminos de octales ni hexadecimales, y la maner aen como se representa es la siguiente forma
/// 3.1415
/// 0.31415e1
/// .31415e1
/// 0.031415E+2
/// Se puede poner un sufijo 
/// float x=3.1415F;
/// double y=0.031415D;
/// 
/// 
/// Unicode
/// '\141' =='a' en forma de unic ode
/// 
/// si se desea usar la forma de hexadecimal debe ser \ con una y u y 4 digitos seguidos
/// '\u0061'
/// 
/// Java lo genera como en c, sellama a la clase java.lang.String, y se asigna omo "",no puede dividrse en varias lineas y se peden incluir caracterse unicode
/// o caracterse de escapes
///Si en dado caos se desae dividir en varias lineas, se puede usar el operador de concatenación +







