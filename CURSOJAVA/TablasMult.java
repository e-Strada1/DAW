import java.util.Scanner;

public class TablasMult {
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int tabla;
        int numero;
        System.out.println("Dime que tabla quieres saber: ");
        tabla = in.nextInt();

        for(int i=0;i <= 10;i++){

            numero = tabla*i;
            System.out.println(tabla+" * "+i+ " = "+numero);

        }
            
        in.close();

    }


}
