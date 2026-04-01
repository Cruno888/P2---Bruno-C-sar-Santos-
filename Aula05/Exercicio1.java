package Aula05;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira seu numero:");
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        int num2 = num1 * 2;
        int num3 = num1 * 3;
        System.out.printf("O dobro do seu numero é %s e o triplo é %d", num2, num3);
        
        leitor.close();


    }
}
