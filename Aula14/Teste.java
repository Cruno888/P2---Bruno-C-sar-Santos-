public class Teste {
    public static void main(String[] args) throws Exception {
        Retangulo ret = new Retangulo();

        System.out.println("valor padrão: ");
        System.out.printf("Altura: %s, Largura: %s\n", ret.getAltura(), ret.getLargura());
        System.out.printf("Area: %s, Perimetro: %s\n", ret.calcularArea(), ret.calcularPerimetro());

        System.out.println("Teste valores:");
        ret.setAltura(5.5);
        ret.setLargura(10.2);
        System.out.printf("Altura: %s, Largura: %s\n", ret.getAltura(), ret.getLargura());
        System.out.printf("Área: %s, Perimetro: %s\n", ret.calcularArea(), ret.calcularPerimetro());

        System.out.println("Teste invalido");
        ret.setAltura(20.1);
        ret.setLargura(-1.0);
        

    }
}
