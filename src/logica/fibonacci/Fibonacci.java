package logica.fibonacci;

public class Fibonacci {
    public static void main(String[] args) {

      int vezes= 10;

      // loop for que imprime os 10 primeiros números da sequência de Fibonacci
      for (int cont = 0, i = 0, j = 1; cont < vezes; cont++) {
          System.out.print(i + " ");

          i = i + j;  // adicionando o valor atual de "i" ao valor atual de "j" e armazenando o resultado em "i"
          j = i - j;  // "j" está recebendo o valor de "i" antes de ser incrementado
      }
    }
}
