import java.util.Scanner;

public class AreaCirculo {

    public static void main(String args[]){

           double area;
            
           Scanner in = new Scanner(System.in);

           System.out.println("Introduce el radio del circulo");
            int radio = in.nextInt();
            area = Math.PI*Math.pow(radio,2);

            System.out.println("El área del circulo es: "+area);
    
            in.close();
        }

}
