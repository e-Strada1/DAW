import java.util.Scanner;
import java.util.Random;

public class Juego{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        int num1,num2;
        int resultado;
        int numerodeoperaciones=0;
        
        do{
            
                
            num1 = rn.nextInt(100)+1;
            num2 = rn.nextInt(100)+1;
            System.out.println(num1+" + "+num2+" =");
            resultado = in.nextInt();
            numerodeoperaciones++;


        }while(resultado == num1+num2);
        
        System.out.println("Ha conseguido realizar "+numerodeoperaciones+" correctamente");
        
        in.close();
    }
}