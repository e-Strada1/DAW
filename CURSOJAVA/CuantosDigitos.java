import java.util.Scanner;

public class CuantosDigitos {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n;
        int digitos = 0;
        System.out.println("Introduce un numero:");
        n = in.nextInt();
        while(n != 0){
            n = n/10;
            digitos++;
        }
        System.out.println("Tiene "+digitos+" digitos");


        in.close();
    }
}
