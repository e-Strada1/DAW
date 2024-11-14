import java.util.Scanner;
public class SonIguales {
    



    public static void main (String args[]){

        Scanner in = new Scanner(System.in);
        int n1,n2;
        System.out.println("Introduce un numero: ");
        n1 = in.nextInt();
        System.out.println("Introduce otro numero: ");
        n2 = in.nextInt();
        if(n1==n2){

            System.out.println("Son iguales");

        }else{
            System.out.println("Son diferentes" );
        }


        in.close();
    }
    
}

