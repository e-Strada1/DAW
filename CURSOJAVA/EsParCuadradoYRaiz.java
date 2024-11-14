import java.util.Scanner;
public class EsParCuadradoYRaiz {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        Boolean par;
        Boolean signo;
        int num = 1;
        while(num != 0){
            System.out.println("Introduce un numero; ");
            num = in.nextInt();
            if(num %2== 0){
                par = true;
            }else{
                par = false;
            }
            if(num <0){
                signo = false;
            }else{
                signo = true;
            }
            if(par){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
            if(signo){
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El numero es negativo");
            }

            System.out.println("Y su cuadrado es: "+Math.pow(num,2));;



        }
    
    
    
        in.close();
    }
}
