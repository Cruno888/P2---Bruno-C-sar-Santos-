package Aula05;
import java.util.Scanner;;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o codigo do primeiro produto:");
        int codigo1 = leitor.nextInt();
        System.out.println("Insira a quantidade do primeiro produto:");
        int quant1 = leitor.nextInt();
        System.out.println("Insira o valor do produto:");
        double valor1 = leitor.nextDouble();
        System.out.println("Insira o codigo do segundo produto:");
        int codigo2 = leitor.nextInt();
        System.out.println("Insira a quantidade do segundo produto:");
        int quant2 = leitor.nextInt();
        System.out.println("Insira o valor do produto:");
        double valor2 = leitor.nextDouble();
        System.out.println("Qual a taxa de serviço?");
        double taxa = leitor.nextDouble();
        double valorTotal = (valor1 * quant1 + valor2 * quant2) * ((taxa/100)+1);
        System.out.printf("O valor total é %s", valorTotal);

    }
}
