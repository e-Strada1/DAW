public class FuncionesMatematicas{

    public static void main(String args[]){

        int n = 2;
        System.out.println(Math.pow(n,8));
        
        double radio = 5,area;
        area = Math.PI *radio*radio;
        area = Math.PI*Math.pow(radio,2);
        System.out.println(Math.ceil(area));
        System.out.println(Math.floor(area));
        System.out.println(Math.round(area));
        System.out.println(Math.sqrt(area*area));
        
        System.out.println(Math.sqrt(Math.pow(n,4)));
    
    }







}