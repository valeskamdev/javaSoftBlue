package logica.metodo2;

import java.util.Scanner;

public class metodo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temp = ler.nextDouble();

        // pedindo ao usuário para inserir um número (1 ou 2)
        System.out.println("Qual a conversão? (1 - F -> C, 2 - C -> F):");
        int opcao = ler.nextInt();

        double result;

        // verificando opcoes
        if (opcao == 1 ) {
          result = converterParaCelsius(temp);
        }else if (opcao == 2) {
          result = converterParaFahrenheit(temp);
        }else {
            System.out.println("Opcao inválida!");
            return;  // encerra o método
        }
        System.out.println("A temperatura convertida é: " + result);
    }

    //  funções que recebem um double como parametro e retornam um double

    // esta função obtém uma temperatura em Fahrenheit e retorna a temperatura equivalente em Celsius
    static double converterParaCelsius(double fahrenheit) {  // parametro "fahrenheit" = temperatura em fahrenheit
        return (fahrenheit - 32) / 1.8;  // valor da variável fahrenheit está sendo retornado
    }

    // esta função obtém uma temperatura em Celcius e retorna a temperatura equivalente em Fahrenheit
    static double converterParaFahrenheit(double celcius) {  // parametro "celcius" = temperatura em celsius
        return (celcius * 1.8 + 32);  // valor da variável celcius está sendo retornado
    }
}
