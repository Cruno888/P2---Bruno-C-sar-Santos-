package Aula08;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Tipo de combustivel");
        char tipo = leitor.next().charAt(0);
        System.out.println("Quantos litros?:");
        int litros = leitor.nextInt();
        double valor;

        if(tipo == 'a'){
            if(litros < 20){
                valor = litros * 4.5 * 0.97;
                System.out.printf("Valor: %s", valor);
            } else{
                valor = litros * 4.5 * 0.95;
                System.out.printf("Valor: %s", valor);
            }
        }else if( tipo == 'g'){
            if(litros < 20){
                valor = litros * 6 * 0.96;
                System.out.printf("Valor: %s", valor);
            } else{
                valor = litros * 6 * 0.94;
                System.out.printf("Valor: %s", valor);
            }

        }
        leitor.close();


    }
}
