package logica.repeticaofor;

import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) {

        int x;

        // imprimindo os números de 0 a 10
        for(x = 0; x <= 10; x++) {
            System.out.println(x);
        }

        // imprimindo os números pares(de dois em dois) de 0 a 10
        for(int y = 0; y <= 10; y+=2) {
            System.out.println(y);
        }
        System.out.println("-------------");
        System.out.println(x);  // 11

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero = ler.nextInt();

        // imprimindo a tabuada de multiplicao do número que o usuário digitou
        System.out.println("Tabuada do número " + numero);
        for(int i = 1; i <=10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }
}
