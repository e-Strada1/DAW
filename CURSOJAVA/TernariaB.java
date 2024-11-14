import java.util.Scanner;

public class TernariaB{

    public static void main(String args[]){

            Scanner in = new Scanner(System.in);

            int n ;
            int valorAbs;
            System.out.println("Introduce un numero: (Puede ser negativo o positivo)");
            n = in.nextInt();
            valorAbs = n < 0 ? -1*n : n;
            System.out.println("Tu numero en valor absoluto es: "+valorAbs);


            in.close();
    }
}