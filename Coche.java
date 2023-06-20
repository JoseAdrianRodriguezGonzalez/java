
public class Coche {
  String color;
  String marca;
  int km;
  //metodo
  public static void main(String[] args) {
      Coche coche1= new Coche();

      coche1.color="Blanco";
      coche1.marca="Audi";
      coche1.km=0;
      System.out.println("El color del coche 1 es: " +coche1.color);
      System.out.println("La marca del coche 1 es: "+coche1.marca);
      System.out.println("El kilometraje del coche 1 es: "+coche1.km);
      Coche coche2= new Coche();
      coche2.color= "Amarillo";
      coche2.marca="Maseratti";
      coche2.km=34;
      System.out.println("El color del coche es: "+coche2.color);
      System.out.println("La marca del coche es: "+coche2.marca);
      System.out.println("El kilometraje del coche es: "+coche2.km);
    }

}