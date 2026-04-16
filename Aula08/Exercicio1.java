package Aula08;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = leitor.nextInt();

        if (idade > 16){
            System.out.println("A idade minima para voto é 16");
        }else if (idade <= 18){
            System.out.println("Você esta na idade de voto obrigatorio");
        }else{
            System.out.println("Você já pode votar");
        }
        leitor.close();

    }
}