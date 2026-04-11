package Aula07;
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String nome1 = "bruno";
        System.out.println("Digite seu nome:");
        String nome2 = leitor.nextLine();

        if(nome1.equals(nome2)){
            System.out.printf("Esse nome já esta sendo usado!");
        } else{
            System.out.printf("Nome válido!");
        }
        leitor.close();
        
    }
}
