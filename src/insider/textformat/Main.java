package insider.textformat;

import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = List.of(
                new Produto(1, "Copo", 3.5),
                new Produto(2, "Caneta", 0.9),
                new Produto(3, "Jogo de Panelas", 130.5)
        );

        for (Produto p : produtos) {

            // format/printf  método que formata a saída de uma string
            // %d  representa números inteiros, %04d números inteiros com 4 posicoes
            // \t  representa um "tab"
            // %20 representa 20 espacos, %-20 mudando o alinhamento para esquerda
            // %s  representa string
            // %.2  representad duas casas decimais
            // %f  representa número float
            // %n representa quebra de linha

            System.out.format(Locale.of("pt", "BR"), "%04d\t%-20s\t%.2f%n" , p.getId(), p.getNome(), p.getPreco());
        }

        double preco = 1356.7;

        // Formatando o "preco" para uma string com duas casas decimais
       String precoStr = String.format("%.2f", preco);
       System.out.println(precoStr);
    }
}
