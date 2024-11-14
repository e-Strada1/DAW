import java.util.Scanner;

public class MiScanner {
    public static void main(String args[]){
        
        String nombre;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        nombre = in.nextLine();
        System.out.println("Hola, "+nombre);

        in.close();
    }
}
