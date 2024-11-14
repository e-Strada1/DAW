import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int primerNumero = -1;  // Variable para gestionar si es el primer número

        while (true) {
            System.out.println("Introduce un número entero (menor o igual a 0 para terminar): ");
            int numero = scanner.nextInt();

            // Si el número es menor o igual a 0, terminamos el bucle
            if (numero <= 0) {
                break;
            }

            // Si no es el primer número, agregar el signo de suma
            if (primerNumero != -1) {
                System.out.println("+");
            }

            // Imprimir el número y agregarlo a la suma
            System.out.println(numero);
            suma += numero;

            // Para manejar el primer número, cambiamos el valor de primerNumero
            if (primerNumero == -1) {
                primerNumero = numero;
            }
        }

        // Mostrar la suma total al final
        if (primerNumero != -1) {
            System.out.println("=" + suma);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        scanner.close();
    }
}
