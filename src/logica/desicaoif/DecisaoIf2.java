package logica.desicaoif;

import java.util.Scanner;

public class DecisaoIf2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // solicitando ao usuário que insira sua idade
        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        // verificando a idade do usuário e imprimindo a faixa etária
        if (idade >= 0 && idade <= 12) {
            System.out.println("Voce é crianca");
        }else if (idade > 12 && idade <= 17) {
            System.out.println("Voce é adolecente");
        }else if (idade > 17 && idade <= 59) {
            System.out.println("Voce é adulto");
        }else if (idade > 59) {
            System.out.println("Voce é idoso");
        }else {
            System.out.println("Idade inválida");
        }
        System.out.println("FIm do programa!");
    }
}
