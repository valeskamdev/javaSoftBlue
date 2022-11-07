package logica.array;

import java.util.Scanner;

public class VetoresArray {
    public static void main(String[] args) {

        // algoritmo que funciona independente da quantidade de arrays

        Scanner ler = new Scanner(System.in);

        // criando um array de doubles com 3 posições
        double[] notas = new double[3];

        // pedindo ao usuário para inserir os valores de cada nota
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = ler.nextDouble();
        }

        // pra cada nota que tiver dentro do array "notas", adiciona dentro da variavel "nota", assim, imprimindo a nota a cada loop
        for (double nota : notas) {
            System.out.println(nota);
        }

        // outra forma de declarar array, nao precisando expecificar tamanho
        String[] frutas = { "melancia", "manga", "uva" };

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    }
}
