import java.util.Arrays;

public class Exercicio2 {
    public static void main(String[] args) {
        int [] x = {1, 3, 5, 8, 9, 1};
        System.out.println(maiorNum(int x));

    }

    public static int maiorNum(int x){
        int maior = Arrays.stream(x).max().getAsInt();
        return maior;
    }
}
