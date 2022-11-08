package logica.desicaoif;

import java.util.Scanner;

public class DecisaoIf {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        if (idade <= 12) {
            System.out.println("Voce é crianca");
        }else {
            System.out.println("Voce é adulto");
        }
        System.out.println("Fim do programa!");
    }
}
