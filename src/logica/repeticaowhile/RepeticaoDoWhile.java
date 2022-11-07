package logica.repeticaowhile;

import java.util.Scanner;

public class RepeticaoDoWhile {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double nota;
        int cont = 1;
        double soma = 0;

        // loop do while, executa primeiro e testa depois (execucacao do bloco garantida)
        do {
            System.out.println("Digite a nota " + cont + ":");
            nota = ler.nextDouble();
            cont++;  // incrementando o valor, o mesmo que "cont = cont + 1"

            if (nota != -1) {
                soma += nota;
                System.out.println("(Soma = " + soma + ")");
            }
        } while (nota != -1);  // verificando se o valor de "nota" é diferente de "-1"
        double media = soma / (cont - 2);  // tirando "2" por conta do incremento
        System.out.println("Média = " + media);
    }
}
