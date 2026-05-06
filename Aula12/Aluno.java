public class Aluno{
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;
    public double notaTrabalho;

        public Aluno(String nome, String matricula, double nota1, double nota2, double notaTrabalho){
            this.nome = nome;
            this.matricula = matricula;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.notaTrabalho = notaTrabalho;
        }

        public double calcularMedia(){
            return (nota1 + nota2 + notaTrabalho)/3;
        }

        public void verificarSituação(){
            if(calcularMedia() >= 7){
                System.out.println("Nome do aluno: " + nome);
                System.out.printf("Sua média foi: %.2f\n", calcularMedia());
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado");
            }
        }


}