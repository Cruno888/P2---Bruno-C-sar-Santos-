package Aula08;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = leitor.nextLine();
        String arvalap = new StringBuilder(palavra).reverse().toString();
        
        System.out.println("Ao contrário: " + arvalap);
        
        leitor.close();
    }
}

