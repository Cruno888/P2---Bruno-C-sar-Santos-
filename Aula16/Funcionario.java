public class Funcionario{
    String nome;
    String cpf;
    double salario;
    String dataNascimento;

    public Funcionario(String nome, String cpf, double salario, String dataNascimento){
        this.nome= nome;
        this.cpf = cpf;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
    }

    public double getSalario(){
        return this.salario;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getDataNascimento(){
        return dataNascimento;
    }

    @Override
    public String toString(){
        return "nome: " + nome + ", cpf: " + cpf + ", salario: " + salario + ", data de nascimento: " + dataNascimento;
    }
}