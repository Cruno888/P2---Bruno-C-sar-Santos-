package Aula05;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("insira o preço da gasolina:");
        double precoGas = leitor.nextDouble();
        System.out.println("Insira quanto dinheiro você tem:");
        double quantUsuario = leitor.nextDouble();

        double quantLitros = quantUsuario / precoGas;
        System.out.printf("Você pode comprar %s litros!", quantLitros);
        leitor.close();


    }
}
