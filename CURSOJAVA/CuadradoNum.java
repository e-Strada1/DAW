import java.util.Scanner;

public class CuadradoNum {
    
    public static void main(String args[]){

        Scanner in  = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero para calcular su cuadrado");
        num = in.nextInt();
        System.out.println("El resultado del cuadrado es: "+ Math.pow(num,2));


        in.close();
    }


}
