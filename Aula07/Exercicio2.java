package Aula07;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome1 = "BRUNO";
        System.out.println("Digite seu nome:");
        String nome2 = leitor.nextLine();

        if(nome1.equalsIgnoreCase(nome2)){
            System.out.printf("Esse nome já esta sendo usado!");
        } else{
            System.out.printf("Nome válido!");
        }
        
        leitor.close();
    }
}
