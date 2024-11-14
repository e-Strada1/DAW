import java.util.Scanner;

public class Sueldo {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int horas;
        int Sueldo;
        

        System.out.println("Introduzca el numero de horas trabajadas al mes");
        horas = in.nextInt();
        Sueldo = horas*10;
        System.out.println("El sueldo es de: "+Sueldo+ "€");




        in.close();



    }

}
