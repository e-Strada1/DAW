import java.util.Scanner;

class AreaCuadrado{

    public static void main(String args[]){

            Scanner in = new Scanner(System.in);
            int lado;            
            int area;
            System.out.println("Introduce las medidas del lado del cuadrado en cm: ");
            lado = in.nextInt();
            area = lado*lado;
            System.out.println("El área del cuadrado es: "+area);


            in.close();
    }

}