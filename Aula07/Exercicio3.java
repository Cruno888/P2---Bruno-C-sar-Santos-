package Aula07;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = leitor.nextLine();
        int num = nome.length();
        System.out.printf("O numero de caracteres é: %s", num);

        
        leitor.close();
    }
}
