package Aula08;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String senha = "1234";
        String senhaUsu = "";
        
        // O laço continua enquanto a senha for diferente da correta
        while (!senhaUsu.equals(senha)) {
            System.out.print("Digite a senha: ");
            senhaUsu = leitor.next();
            
            if (!senhaUsu.equals(senha)) {
                System.out.println("Senha incorreta! Tente novamente.");
            }
        }
        
        System.out.println("Acesso permitido");
        
        leitor.close();
    }
}

