import java.util.Scanner;
public class PositivoONegativo {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        int num;
        System.out.println("Introduce un numero: ");
        num = in.nextInt();
        if(num < 0){
            System.out.println("El numero introducido es negativo");
        }else{
            System.out.println("El numero es positivo");
        }

        in.close();
    }
}
