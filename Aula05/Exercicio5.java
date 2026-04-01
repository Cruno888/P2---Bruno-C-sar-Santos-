package Aula05;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        double valorIngre = 40;
        System.out.println("qual o tipo de ingresso você deseja?");
        Scanner leitor = new Scanner(System.in);
        String tipoIngre = leitor.nextLine().toUpperCase();

        if(tipoIngre.equals("I")){
            System.out.printf("O valor do do ingresso é: %s", valorIngre);
        }else if(tipoIngre.equals("M")){
            valorIngre = 40/2;
            System.out.printf("O valor do ingresso é %s", valorIngre);
        }else{
            System.out.println("Tipo invalido!");
        }
        leitor.close();


    }
}
