package logica.repeticaofor;

import java.util.Scanner;

public class RepeticaoFor {
    public static void main(String[] args) {
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
