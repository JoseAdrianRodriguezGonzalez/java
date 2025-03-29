/*Programa No 10
 * Ejercicio crear una clase para el manejo de numeros complejos que permita realizaer las operaciones 
 * aritemticas bascias
 */
import java.util.Scanner;
public class Complejo{
    private float real;
    private float imaginario;
    Complejo(){
        this.real=0;
        this.imaginario=0;
    }
    Complejo(float r,float i){
        this.real=r;
        this.imaginario=i;
    }
    Complejo(Complejo W){
        this.real=W.real;
        this.imaginario=W.imaginario;
    }
    public void Inicializar(float re, float im){
        real=re;
        imaginario=im;
    }
    public void Show(){
        if(imaginario<0)
            System.out.print(this.real+""+this.imaginario+"i"); 
        else   
            System.out.print(this.real+"+"+this.imaginario+"i");
    }
    public void Suma(float r,float i){
        real+=r;
        imaginario+=i;
    }
    public void Suma(Complejo Z){
        this.real+=Z.real;
        this.imaginario+=Z.imaginario;
    }
    public void Suma(Complejo Z, Complejo W){
        real=Z.real+W.real;
        imaginario=W.real+W.imaginario;
    }
    public Complejo suma(Complejo Z){
        Complejo aux= new Complejo();
        aux.real=real+Z.real;
        aux.imaginario=imaginario+Z.real;
        return aux;
    }

    public void Resta(float r,float i){
        real-=r;
        imaginario-=i;
    }
    public void Resta(Complejo Z){
        this.real-=Z.real;
        this.imaginario-=Z.imaginario;
    }
    public void Resta(Complejo Z, Complejo W){
        real=Z.real-W.real;
        imaginario=W.real-W.imaginario;
    }
    public Complejo resta(Complejo Z){
        Complejo aux= new Complejo();
        aux.real=real-Z.real;
        aux.imaginario=imaginario-Z.real;
        return aux;
    }
    public void Producto(float r, float i){
        float aux;
        aux=(r*real)-(i*imaginario);
        imaginario= (real*i)+(r*imaginario);
        real=aux;
    }
    public void Producto(Complejo Z){
        float aux;
        aux=(Z.real*real)-(Z.imaginario*imaginario);
        imaginario= (Z.real*imaginario)+(Z.imaginario*real);
        real=aux;
    }
    public void Producto(Complejo Z, Complejo W){
        real=(Z.real*W.real)-(Z.imaginario*W.imaginario);
        imaginario= (Z.real*W.imaginario)+(Z.imaginario*W.real);
    }
    public Complejo Por(Complejo Z){
        Complejo aux=new Complejo();
        aux.real=(real*Z.real)-(imaginario*Z.imaginario);
        aux.imaginario=(real*Z.imaginario)+(Z.real*imaginario);
        return aux;
    }
    public void Cociente(Complejo Z, Complejo W){
        Complejo conjugado=new Complejo(W.real,-W.imaginario);
        float Denominador=W.real*W.real+W.imaginario*W.imaginario;
        Producto(Z,conjugado);
        real/=Denominador;
        imaginario/=Denominador;
    }
    public Complejo Entre(Complejo W){
        Complejo conjugado=new Complejo(W.real,-W.imaginario);
        float Denominador=W.real*W.real+W.imaginario*W.imaginario;
        Complejo aux=Por(conjugado);
        aux.real/=Denominador;
        aux.imaginario/=Denominador;
        return aux;
    }
    public void Cociente(Complejo W){
        Complejo conjugado=new Complejo(W.real,-W.imaginario);
        float Denominador=W.real*W.real+W.imaginario*W.imaginario;
        Producto(conjugado);
        real/=Denominador;
        imaginario/=Denominador;
    }
    public float getReal(){
        return this.real;
    }
    public float getComplejo(){
        return this.imaginario;
    }
    public void Captura(){
        Scanner scanf=new Scanner(System.in);
        System.out.print("re=");
        real=scanf.nextFloat();
        System.out.print("im=");
        imaginario=scanf.nextFloat();
    }
}
class programa10{
    public static void main(String[] args){
        Complejo Z=new Complejo(1,2);
        Complejo Z2=new Complejo(1,2);
        Complejo Z3= new Complejo();
        Complejo R=new Complejo();
        System.out.println("\nZ3=");
        Z3.Show();
    }
}