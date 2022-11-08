package logica.recursao;

public class Recursividade {
    public static void main(String[] args) {

        // calculando fatorial
        int result = fatorial(3);
        System.out.println("O fatorial é: " + result);
    }

    static int fatorial(int numero) {

        // chamada recursiva, pois dentro dela é feita uma ou mais chamadas a ela mesma
        if (numero == 0) {
            return 1;  // método termina se for true
        }
        return numero * fatorial(numero - 1);
    }
}
