package insider.memory;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Eliseu";
        aluno1.nota = 8.2;

        Aluno aluno2 = criarAluno("Agatha", 9.0);
        diminiuirNota(aluno2);

        aluno2 = new Aluno();
        aluno2.nome = "Evellin";
        aluno2.nota = 7.5;
    }

    public static Aluno criarAluno(String nome, double nota) {
        Aluno aluno = new Aluno();
        aluno.nome = nome;
        aluno.nota = nota;
        return aluno;
    }

    static void diminiuirNota(Aluno aluno) {
        aluno.nota--;
    }

    // variaveis do tipo primitivo o valor fica dentro da variavel
    // varaiveis do tipo Classe o valor é uma referencia para um objeto que esta no HEAP
}
