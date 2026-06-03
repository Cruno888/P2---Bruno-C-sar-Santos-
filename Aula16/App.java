import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        int opcao = 0;

        do {
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1. Adicionar gerente");
            System.out.println("2. Adicionar atendente");
            System.out.println("3. Listar todos os funcionários");
            System.out.println("4. Mostrar salário de funcionário (por CPF)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nCadastrar Gerente");
                    System.out.print("Nome: ");
                    String nomeG = scanner.nextLine();

                    System.out.print("CPF: ");
                    String cpfG = scanner.nextLine();

                    System.out.print("Salário Base: ");
                    double salarioG = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Data de Nascimento: ");
                    String dataG = scanner.nextLine();

                    listaFuncionarios.add(new Gerente(nomeG, cpfG, salarioG, dataG));
                    System.out.println("Gerente adicionado com sucesso!");
                    
                    break;

                case 2:
                    System.out.println("\nCadastrar Atendente");
                    System.out.print("Nome: ");
                    String nomeA = scanner.nextLine();

                    System.out.print("Cfp: ");
                    String cpfA = scanner.nextLine();

                    System.out.print("Salaro Base: ");
                    double salarioA = scanner.nextDouble();

                    System.out.print("Comissão: ");
                    double comissaoA = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Data de nascimento: ");
                    String dataA = scanner.nextLine();

                    listaFuncionarios.add(new Atendente(nomeA, cpfA, salarioA, dataA, comissaoA));
                    System.out.println("Atendente adicionado com sucesso!");
                    
                    break;

                case 3:
                    System.out.println("\n Lista de Funcionários");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionario cadastrado.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            System.out.println(f);
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n Buscar Salário por CPF");
                    System.out.print("Informe o cpf do funcionario: ");
                    String cpfBusca = scanner.nextLine();
                    boolean encontrado = false;

                    for (Funcionario f : listaFuncionarios) {
                        if (f.getCpf().equals(cpfBusca)) {
                            System.out.println("Funcionario: " + f.getNome());
                            System.out.println("Salario calculado: R$ " + f.getSalario());
                            encontrado = true;
                            
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Funcionário com o CPF " + cpfBusca + " não foi encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("encerrando o programa... Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
