import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int N, mayor, menor, conteomayor, conteomenor;

        System.out.println("Introduce el numero de numeros a introducir: ");
        int n = in.nextInt();
        int i = 0;
        mayor = 0;
        menor = 0;
        conteomenor = 0;
        conteomayor = 0;
        while (i < n){

            System.out.println("Introduce un numero: (Quedan"+n+" numeros)");
            N = in.nextInt();
            
            if(N < menor || i == 0){
                menor = N;
                conteomenor = 0;
            }

            if(N > mayor){
                mayor = N;
                conteomayor = 0;
            }
            
            if(N == mayor){
                conteomayor++;
            }
            
            if(N == menor){
                conteomenor++;
            }

            n--;
        }

        System.out.println("El numero mayor es "+mayor+" que ha aparecido "+conteomayor+"veces y el menor es "+menor+" que ha aparecido "+conteomenor+" veces");

        in.close();

    }

}