package Aula05;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("insira sua idade:");
        int num1 = leitor.nextInt();

        if(num1 >= 16){
            System.out.println("Pode votar!");
        } else{
            System.out.println("Não pode votar!");
        }
        leitor.close();

    }
}
