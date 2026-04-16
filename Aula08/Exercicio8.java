package Aula08;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = leitor.nextInt();
        
        System.out.println("Tabuada de " + num + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " vezes " + i + " = " + resultado);
        }
        
        leitor.close();
    }
}

