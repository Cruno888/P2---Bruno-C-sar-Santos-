import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras{
    public static void main(String[] args){
        ArrayList<String> lista = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int botao = 0;

        while (botao != 4){
            System.out.println("1: Adicionar um item");
            System.out.println("2: Listar item");
            System.out.println("3: Remover um item");
            System.out.println("4: Sair");

            botao = leitor.nextInt();
            leitor.nextLine();

            switch (botao) {
                case 1:
                    System.out.println("Adicione um item:");
                    String adicionarItem = leitor.nextLine();
                    lista.add(adicionarItem);
                    System.out.printf("O item %s foi adicionado a lista\n", adicionarItem);
                    break;
                
                case 2:
                    if(lista.isEmpty()){
                        System.out.println("Sua lista esta vazia");
                    }else{
                        for(int i = 0; i < lista.size(); i++){
                            System.out.println(i + " : " + lista.get(i)\n);
                        }
                    }
                    break;

                case 3:
                    if(lista.isEmpty()){
                        System.out.println("A lista esta vazia");
                    }else{
                        System.out.println("Escolha qual item remover:");
                        int removerItem = leitor.nextInt();
                        
                        if(removerItem >= 0 && removerItem < lista.size()){
                            String itemRemovido = lista.remove(removerItem);
                            System.out.printf("Item %s foi removido\n", itemRemovido);
                        }else {
                            System.out.println("Item invalido");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
        leitor.close();
    }
}
