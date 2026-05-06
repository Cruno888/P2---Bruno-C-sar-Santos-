public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Bruno", "65658566", 8.5, 6.5, 8.0);
        Aluno aluno2 = new Aluno("Ana", "658765758", 5.5, 7.5, 9.0);

        aluno1.verificarSituação();
        aluno2.verificarSituação();
    }
}
