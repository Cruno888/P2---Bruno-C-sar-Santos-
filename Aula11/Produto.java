public class Produto{
        String nome;
        double preco;
        int quantidade;

        public Produto(String nome, double preco, int quantidade){
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public void exibirInfo(){
            System.out.println("Produto: " + nome);
            System.out.println("Preço: " + preco);
            System.out.println("Quantidade: " + quantidade);
        }

        public double calcularValorTotalEmEstoque(){
            System.out.print("O valor total deste produto em esqtoque é: ");
            return preco * quantidade;
        }

        public void adicionarEstoque(int quantidadeAdd){
            quantidade = quantidade + quantidadeAdd;
            System.out.println("seu estoque agora é: " + quantidade );
        }
    }
    