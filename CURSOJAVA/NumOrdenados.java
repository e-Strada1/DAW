import java.util.Scanner;

public class NumOrdenados {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n1, n2, n3;
        int menor, mayor, medio;
        System.out.println("Introduce 3 números: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if(n1 < n2 && n1 <n3){
            menor = n1;
        }else if(n2 < n1 && n2 <n3){
            menor = n2;
        }else{
            menor = n3;
        }
        if(n1 >n2 && n1 >n3){
            mayor = n1;
        }else if (n2 > n1 && n2 > n3){
            mayor = n2;
        }else{
            mayor = n3;
        }
        if(n1 > menor && n1 < mayor){
            medio = n1;
        }else if(n2 > menor && n2 < mayor){
            medio = n2;
        }else{
            medio = n3;
        }

        System.out.println("El numero mas alto es "+mayor+" el del medio es "+medio+" y el menor es "+menor);
        in.close();

    }
}
