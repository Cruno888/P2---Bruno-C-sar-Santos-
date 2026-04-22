public class Exercicio3 {
    public static void main(String[] args){
        String [] lista = {"bruno", "cesar", "santos", "batista"};
        String nome = "luis";
        System.out.print(elementoExiste(lista, nome));
    }

    public static boolean elementoExiste(String[] lista, String nome){
        for (int i = 0; i < lista.length; i++){
            if(lista[i].equals(nome)){
                return true;
            }
        }
        return false;
    }
}
