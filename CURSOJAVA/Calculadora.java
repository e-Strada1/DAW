import java.util.Scanner;

public class Calculadora {
    static double suma(double A, double B) {

        return A + B;
    }

    static double resta(double A, double B) {

        return A - B;
    }

    static double multiplicacion(double A, double B) {

        return A * B;
    }

    static double division(double A, double B) {
        return A / B;
    }

    static double potencia(double A, int i) {

        return Math.pow(A, i);

    }

    static double raiz(double A) {
        return Math.sqrt(A);
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int operacion;
        int elevado;
        double num1;
        double num2;
        double resultado;
        double resultadoAnt = 0;
        do {
            System.out.println("Que operacion quieres realizar?\n" + "1.Suma\n" + "2.Resta\n" + "3.Multiplicacion\n"
                    + "4.Division\n" + "5.Potencia\n" + "6.Raiz\n" +"7.Cambiar número.\n"+ "0.Salir del programa");
            operacion = in.nextInt();
            if (operacion == 0) {
                break;
            }

            if (operacion == 1) {
                if(resultadoAnt ==0){
                    System.out.println("Introduce el primer numero para calcular:");
                    num1 = in.nextDouble();
                    System.out.println("Introduce el segundo numero para calcular:");
                    num2 = in.nextDouble();
                    resultado = suma(num1, num2);
                    resultadoAnt = resultado;
                    System.out.println("El resultado de la resta es: " + resultado + "\n");
                }else{
                    System.out.println("Introduce el numero por el que restar el resultado anterior:");
                    num1 = in.nextDouble();
                    resultado = suma(resultadoAnt,num1);
                    resultadoAnt = resultado;
                    System.out.println("El resultado de la resta es: "+resultado+"\n");
                }
                    
            }

            if (operacion == 2) {
                if(resultadoAnt ==0){
                System.out.println("Introduce el primer numero para calcular:");
                num1 = in.nextDouble();
                System.out.println("Introduce el segundo numero para calcular:");
                num2 = in.nextDouble();
                resultado = resta(num1, num2);
                resultadoAnt = resultado;
                System.out.println("El resultado de la resta es: " + resultado + "\n");
                }else{
                System.out.println("Introduce el numero por el que restar el resultado anterior:");
                num1 = in.nextDouble();
                resultado = resta(resultadoAnt,num1);
                resultadoAnt = resultado;
                System.out.println("El resultado de la resta es: "+resultado+"\n");
                }
                
            }

            if (operacion == 3) {
                if(resultadoAnt ==0){
                    System.out.println("Introduce el primer numero para calcular:");
                    num1 = in.nextDouble();
                    System.out.println("Introduce el segundo numero para calcular:");
                    num2 = in.nextDouble();
                    resultado = multiplicacion(num1, num2);
                    resultadoAnt = resultado;
                    System.out.println("El resultado de la resta es: " + resultado + "\n");
                    }else{
                    System.out.println("Introduce el numero por el que restar el resultado anterior:");
                    num1 = in.nextDouble();
                    resultado = multiplicacion(resultadoAnt,num1);
                    resultadoAnt = resultado;
                    System.out.println("El resultado de la resta es: "+resultado+"\n");
                    }
            }

            if (operacion == 4) {
                if(resultadoAnt ==0){
                    System.out.println("Introduce el primer numero para calcular:");
                    num1 = in.nextDouble();
                    System.out.println("Introduce el segundo numero para calcular:");
                    num2 = in.nextDouble();
                    resultado = division(num1, num2);
                    resultadoAnt = resultado;
                    System.out.println("El resultado de la resta es: " + resultado + "\n");
                    }else{
                    System.out.println("Introduce el numero por el que restar el resultado anterior:");
                    num1 = in.nextDouble();
                    resultado = division(resultadoAnt,num1);
                    resultadoAnt = resultado;
                    System.out.println("El resultado de la resta es: "+resultado+"\n");
                    }
            }
            if (operacion == 5) {
                if(resultadoAnt ==0){
                System.out.println("Introduce el numero que quieras elevar:");
                num1 = in.nextDouble();
                System.out.println("Escribe el elevado:");
                elevado = in.nextInt();
                resultado = potencia(num1, elevado);
                resultadoAnt = resultado;
                System.out.println("El resultado de la potencia es: " + resultado + "\n");
                }else{
                System.out.println("A que numero quieres elevar el resultado anterior?");
                elevado = in.nextInt();
                resultado = potencia(resultadoAnt,elevado);
                resultadoAnt = resultado;
                System.out.println("El resultado de la potencia es: "+resultado);
                }
            }
            if (operacion == 6) {
                if(resultadoAnt == 0){
                System.out.println("Introduce el numero del que quieres la raiz:");
                num1 = in.nextDouble();
                resultado = raiz(num1);
                System.out.println("La raiz cuadrada es: " + resultado);
                }else{
                resultado = raiz(resultadoAnt);
                resultadoAnt = resultado;
                System.out.println("La raiz cuadrada es: " + resultado+"\n");
                }
            }
            if(operacion ==7){
                resultadoAnt = 0;
                System.out.println("Historial borrado.\n");
            }

            if (operacion > 8) {
                System.out.println("Operación invalida\n");
            }

        } while (operacion != 0);

        System.out.println("Adios!!\n");

        in.close();

    }

}
