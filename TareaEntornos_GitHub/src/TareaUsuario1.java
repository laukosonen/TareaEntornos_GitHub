import java.util.Scanner;

public class TareaUsuario1 {
    public static void main (String [] args){

        //-Se le piden dos números enteros al usuario
        //-Se calcula la suma de los dos números
        //-Se muestra la suma de los dos números por pantalla

        int suma=0;
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 2; i++)
        {
            System.out.println("Introduce número");
            int numero= scanner.nextInt();
            suma+=numero;
        }
    }



}
