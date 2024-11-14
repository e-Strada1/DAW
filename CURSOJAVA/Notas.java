import java.util.Scanner;

public class Notas {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int numero;
        int adivinar;

        System.out.println("Introduce un número a adivinar:");
        numero = in.nextInt();

        
       do{
        System.out.println("Introduce un numero");
        adivinar = in.nextInt();

            if (adivinar < numero) {
                System.out.println("El numero es mayor");
            }
            if (adivinar > numero) {
                System.out.println("El numero es menor");
            }
            if (adivinar == numero) {
                System.out.println("Has adivinado el numero");
            }
        }while(adivinar != numero);

        in.close();
    }
}
