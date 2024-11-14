import java.util.Scanner;

public class MayorQue {
    public static void main(String args[]){

    Scanner in = new Scanner(System.in);
    int n1;
    int n2;    
    System.out.println("Introduce dos numeros: ");
    n1 = in.nextInt();
    n2 = in.nextInt();
    
    if(n1 < n2){
        System.out.println(n2+" es mayor que "+n1);
    }else{
        System.out.println(n1 +" es mayor que "+n2);
    }
    
    in.close();

    }
}
