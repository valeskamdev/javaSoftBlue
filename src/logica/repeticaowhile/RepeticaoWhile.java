package logica.repeticaowhile;

import java.util.Scanner;

public class RepeticaoWhile {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double nota = 0;
        int cont = 1;
        double soma = 0;

        // loop while, testa primiro e executa depois
        while (true) {  // loop nao infinito, pois internamente tem uma estrutura que faz o break
        System.out.println("Digite a nota " + cont + ":");
        nota = ler.nextDouble();

        //  quebrando o loop se o usuário digitar -1, entao sai do loop while
        if (nota == -1) {
            cont--;  // tirando a incrementacao da nota anterior
            break;
        }

        soma += nota;  // atribuindo o valor da nota a variavel soma, somando as notas a cada loop
        System.out.println("(Soma: " + soma + ")");
        cont++;
        }
        double media = soma / cont;
        System.out.println("Media: " + media);
    }
}
