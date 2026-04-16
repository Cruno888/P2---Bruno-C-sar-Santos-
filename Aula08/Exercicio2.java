package Aula08;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a idade do nadador");
        int idade = leitor.nextInt();

        if(idade > 4 && idade < 11){
            if(idade >= 4 && idade < 8){
                System.out.println("Infantil A");
            }else if(idade >= 8 && idade < 11){
                System.out.println("Infantil B");
            }

        }else if(idade >= 11 && idade < 17){
            if(idade >= 11 && idade < 14){
                System.out.println("Juvenil A");
            }else if(idade >= 14 && idade < 18){
                System.out.println("Juvenil B");
            }

        }else if(idade >= 18){
            System.out.println("Adulto");

        }else{
            System.out.println("Idade invalida");
        }
        leitor.close();
    }
    
    
}
