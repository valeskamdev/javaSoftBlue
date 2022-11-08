package logica.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

        // chamando o método para executar e passando dois parametros
        calcularFibonacci(7, ",");
        System.out.println();  // pulando linha

        calcularFibonacci(4, "-");
        System.out.println();

        int[] valores = calcularFibonacci(10);
        for (int valor : valores) {  // imprimindo os elementos do array
            System.out.print(valor + " ");
        }

        System.out.println();
        System.out.println("Fim!");
    }

    // método que calcula a sequencia de Fibonacci
    static void calcularFibonacci(int vezes, String separador) {  // método void nao usa "return", pois nao retorna nada

        // loop for que imprime os 10 primeiros números da sequência de Fibonacci
        for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
            System.out.print(i + separador);

            i = i + j;  // adicionando o valor atual de "i" ao valor atual de "j" e armazenando o resultado em "i"
            j = i - j;  // "j" está recebendo o valor de "i" antes de ser incrementado
        }
    }

    // método que retorna um array de inteiros
    static int[] calcularFibonacci(int vezes) {
        int[] resposta = new int[vezes];  // criando um array de inteiros com o tamanho do parâmetro "vezes"

        // loop for que imprime os 10 primeiros números da sequência de Fibonacci
        for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {

            i = i + j;  // adicionando o valor atual de "i" ao valor atual de "j" e armazenando o resultado em "i"
            j = i - j;  // "j" está recebendo o valor de "i" antes de ser incrementado

            resposta[cont] = i;  // armazenando o valor de "i" na posicao do array
        }
        return resposta;
    }
}
