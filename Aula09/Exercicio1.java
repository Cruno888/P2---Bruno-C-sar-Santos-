public class Exercicio1{
    public static void main(String[] args){
        double a = 5;
        double b = 3;
        System.out.println(hipotenusa(a, b));
    }

    public static double hipotenusa(double a, double b){
        double x = Math.sqrt(a * a + b * b);
        return x;

    }
}
