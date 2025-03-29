

public class Programa {
    
    public static void main(String[] args){
        int k;
        int[] datos={10,15,20,25,30};
        float[][] datos2={{1.1f,1.2f,1.3f},{2.1f,2.2f,2.3f},{3.1f,3.2f,3.3f}};
        int[][] Arreglo={{1,2,3},
                         {1,2},
                         {1,2,3,4,5},
                         {10,20,1},
                         {1,2,3,4,5,6,7,8},
                        };
        System.out.println("Arreglo:");
        for(k=0;k<datos.length;k++)
            System.out.println("datos["+k+"]="+datos[k]);
        for(int i=0;i<datos2.length;i++){
            System.out.println("");
            for(int j=0;j<datos2[0].length;j++){
                System.out.println(datos2[i][j]+" ");
            }
        }


        for(int i=0;i<Arreglo.length;i++){
            System.out.println("");
            for(int j=0;j<Arreglo[i].length;j++){
                System.out.print(Arreglo[i][j]+" ");
            }
        }
    }
}
