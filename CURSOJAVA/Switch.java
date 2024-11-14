import java.util.Scanner;

public class Switch {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Ingrese un numero: ");
        x = in.nextInt();
        switch(x){
            case 1:
            case 2:
            case 3:
                System.out.println("El numero esta entre 1 y 3" );break;

            case 4:
            case 5:
                System.out.println("El numero esta entre 4 y 5" );break;
            case 6:
                System.out.println("El numero es 6" );
                break;
            default:
                System.out.println("El numero no esta entre 1 y 6" );break;

        }
            


        in.close();


    }


}
