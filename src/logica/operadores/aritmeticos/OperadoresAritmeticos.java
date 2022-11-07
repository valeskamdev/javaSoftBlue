package logica.operadores.aritmeticos;

import java.util.Scanner;


public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // exercicio 1, leia dois textos que o usuario inseriu, imprima-os no console e a concatenacao deles


        String texto1;
        String texto2;

        // ler dados no console
        Scanner ler = new Scanner(System.in);

        // pedindo ao usuário para inserir uma string e depois armazenando-a na variável texto1
        System.out.println("Digite o texto 1: ");
        texto1 = ler.nextLine();

        // pedindo ao usuário para inserir uma string e depois armazenando-a na variável texto2
         System.out.println("Digite o texto 2: ");
        texto2 = ler.nextLine();

        // concatenando as duas strings, "texto1" e "texto2"
        String textoJunto = texto1 + texto2;
        System.out.println("Texto final: " + textoJunto);

        System.out.println("-------------------------------------");
        // exercicio 2, leia tres entradas de dados para realizar a equacao de 2grau e imprima-os


        // solicitando que o usuário insira os valores para "a", "b" e "c"
        System.out.println("a: ");
        int a = ler.nextInt();

        System.out.println("b: ");
        int b = ler.nextInt();

        System.out.println("c: ");
        int c = ler.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;  // retornando valor de delta
        double x1 = (- b + Math.sqrt(delta)) / (2 * a);  // retornando valor de x1
        double x2 = (- b - Math.sqrt(delta)) / (2 * a);  // retornando valor de x2

        System.out.println("Valor de delta: " + delta);

        // verificando se o valor de delta é menor ou igual a -1
        if (delta <= -1) {
            System.out.println("Os valores de x1 e x2 são imaginários!");
        }else {
            System.out.println("Valor de x1: " + x1);
            System.out.println("Valor de x2: " + x2);
        }

        System.out.println("-------------------------------------");
        // exercicio 3, calculando a área e o perímetro do hexágono


        int lado = ler.nextInt();  // pedindo ao usuário que insira um valor para a variável "lado"
        int perimetro = 6 * lado;  // calculando o perímetro do hexágono
        double area = (3 * lado * Math.sqrt(3)) / 2;  // calculando a área de um hexágono

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

    }
}
