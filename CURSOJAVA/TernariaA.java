import java.util.Scanner;

public class TernariaA {
    
        public static void main(String args[]){

            Scanner in = new Scanner(System.in);
            int n;
            int valorabsoluto;
            System.out.println("Introduce un numero: (Puede ser negativo o positivo)");
            n = in.nextInt();
            valorabsoluto = Math.abs(n);
            System.out.println("El valor absoluto de su numero es: "+valorabsoluto);
            in.close();
        }
}
