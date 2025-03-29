import java.util.Scanner;
class Primer{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //Hacer uso de los elementos vaico del lenguaje java para reslver el siguiente ejerccio
        //Implementar un programa que ocntega el siguiente menu de opciones
        //Sumatoria
        //Facotrila
        //Serei de fibonacci
        //Implementar una funcion para cada opcion del menu, utilziar recursividad para las primeras funcioens
        byte opciones=0;
        do{
            System.out.println("Menu de calculos \n1.-Sumatoria \n2.-Factorial \n3.-serie de Fibonacci \n4.-Solución de ecuación de segundo grado \n5.- Salir");
            System.out.println("Introduzca el valor: ");
            opciones=sc.nextByte();
            System.out.println("Escogió la opción de "+opciones);            
            switch (opciones) {
                case 1:
                    System.out.println("Escriba los valores que necesita sumar:");
                    int n= sc.nextInt();
                    if(n<=0){
                        System.out.println("No se admiten numeros negativos o 0, solo naturales");
                    }
                    int result=sumatoria(n);
                    System.out.println("El valor de la sumatoria "+n+"es: "+result);
                    break;
                case 2:
                    System.out.println("Hasta que numero quieres colocar");
                    int numero =sc.nextInt();
                    System.out.println("el factorial de "+numero+"es"+factorial(numero));
                    break;
                case 3:
                    System.out.println("Cuantos terminos de la sucesion requieres?");
                    int serie2=sc.nextInt();
                    //System.out.println(serie(serie2));
                    int n_=0;
                    while(n_<serie2){
                        int fn=serie(n_);
                        System.out.print(fn+" "); 
                        n_++;
                    }   

                    break;
                case 4:
                    System.out.println("Solución de ecuaciones de segundo grado");
                    System.out.println("a=");
                    double a=sc.nextDouble();
                    System.out.println("b=");
                    double b=sc.nextDouble();
                    System.out.println("c=");
                    double c=sc.nextDouble();
                    //double[] soluciones =ecuacion(a, b, c); 
                    ecuacion(a,b,c);
                    break;
                case 5:
                    System.out.println("EL programa ha terminado");
                    break;
                default:
                System.out.println("Opcion no valida...");
                    break;
            }
        }while(opciones!=5);
    }
    public static int sumatoria(int n){
        return (n==1)?1:n+sumatoria(n-1);
    }
    public static int factorial(int n){    
        return n==0?1: n*factorial(n-1);
    }
    public static int serie(int n){
        if(n==0|| n==1)
            return n;
        else
            return serie(n-1)+serie(n-2);
            
    }
    public static void ecuacion(double a,double b, double c){
        double discriminante=Math.pow(b,2)-(4*a*c);//double es el resultado de Math.pow
        if(discriminante<0){
            double x1r=-b/(2*a);
            double x1i=Math.sqrt((-1)*discriminante)/(2*a);
            double x2i=-Math.sqrt((-1)*discriminante)/(2*a);
            double x2r=-b/(2*a);
            System.out.println("x1="+x1r+"+"+x1i+"i"+"\n"+"x2="+x2r+x2i+"i");
        }else{
           double x1=(-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
           double x2=(-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a);
            System.out.println("x1="+x1+"\n"+"x2="+x2);
        }
        
    }
}


// / byte nextByte()
// / nextShort()
// nextInt()
//next().charAt(0), posicion
//nextLine string