package logica.operadores.relacionaislogicos;

import java.util.Scanner;

public class RelacionaisLogicos {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // solicitando que o usuário insira um número
        System.out.println("numero 1: ");
        int numero1 = ler.nextInt();

        // solicitando que o usuário insira um número
        System.out.println("numero 2: ");
        int numero2 = ler.nextInt();

        // comparando os dois números e imprimindo o resultado
        boolean igual = numero1 == numero2;
        System.out.println("iguais? " + igual);

        boolean diferente = numero1 != numero2;
        System.out.println("diferentes? " + diferente);

        boolean primeiroMaiorQueSegundo = numero1 > numero2;
        System.out.println("primeiro mair que segundo? " + primeiroMaiorQueSegundo);

        boolean primeroMaiorIgualQueSegundo = numero1 >= numero2;
        System.out.println("primero maior igual que segundo? " + primeroMaiorIgualQueSegundo);
    }
}
