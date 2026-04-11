package Aula07;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("Digite sua frase:");
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.nextLine();
        System.out.println("Digite sua palavra:");
        String palavra = leitor.nextLine();
        
        int buscar = buscarPalavra(frase, palavra);

        if (buscar != -1) {
            System.out.printf("Palavra encontrada na posição: %s", buscar);
        } else{
            System.out.printf("Palavra não encontrada");
        }

        
        leitor.close();
    }

    public static int buscarPalavra(String frase, String palavra){
        int buscar = frase.indexOf(palavra);
        if (buscar != -1) {
            return buscar;
        } else {
            return -1;
        }
    }
}
