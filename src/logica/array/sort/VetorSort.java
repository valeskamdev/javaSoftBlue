package logica.array.sort;

public class VetorSort {
    public static void main(String[] args) {

        // ordenacao de elementos

        int[] valores = {3, 6, 5, 2, 1, 4, 0, 7 };

         /* loop for que irá percorrer o array, para cada vez percorrida, todos os elementos
         são comparados com o seu próximo, para verificar se estão na ordem desejada */

        for(int posicaAtual = 0; posicaAtual < valores.length - 1; posicaAtual++) {
            for(int proximaPosicao = posicaAtual + 1; proximaPosicao < valores.length; proximaPosicao++) {  // comparando os valores do array
                if(valores[posicaAtual] > valores[proximaPosicao]) {  // comparando os valores do array
                    int aux = valores[posicaAtual];  // variável temporária para armazenar o valor atual do array
                    valores[posicaAtual] = valores[proximaPosicao];  // invertendo os valores do array
                    valores[proximaPosicao] = aux;  // trocando os valores do array
                }
            }
        }

        // imprimindo todos os elemntos do array
        for(int valor : valores) {
            System.out.print(valor + " ");
        }
    }
}
