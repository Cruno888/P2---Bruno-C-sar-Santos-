public class teste {
    public static void main(String[] args) {
        Produto p1 = new Produto("macarrão", 2.50, 20);
        Produto p2 = new Produto("arroz", 4.0, 15);
        Produto p3 = new Produto("feijão", 6.0, 8);

        p1.exibirInfo();
        System.out.println(p1.calcularValorTotalEmEstoque());
        p1.adicionarEstoque(4);

        p2.exibirInfo();
        System.out.println(p2.calcularValorTotalEmEstoque());
        p2.adicionarEstoque(1);

        p3.exibirInfo();
        System.out.println(p3.calcularValorTotalEmEstoque());
        p3.adicionarEstoque(9);
        }
}
