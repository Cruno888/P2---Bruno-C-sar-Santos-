package Aula05;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor do produto:");
        double valor = leitor.nextDouble();
        System.out.println("Insira a quantidade:");
        int quant = leitor.nextInt();
        double total = valor * quant;
        double valorf;
        

        if (total > 100){
            valorf = total * 0.8;
            System.out.printf("Valor final, com desconto, é: %s reais", valorf);
        } else{
            System.out.printf("Valor final é : %s reais", total);
        }
        leitor.close();
    }
}
