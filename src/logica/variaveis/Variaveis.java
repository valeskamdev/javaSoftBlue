package logica.variaveis;

public class Variaveis {
    public static void main(String[] args) {

        int idade = 20;  // declarando uma variável e atribuindo o valor 20 (inteiro)
        double nota = 8.6;  // declarando uma variável e atribuindo o valor 8.6 (decimal)
        boolean ligado = true;  // declarando uma variável e atribuindo o valor "true" (boolean)
        boolean ativo = false;  // declarando uma variável e atribuindo o valor "false" (boolean)
        String nome = "Allan";  // declarando uma variável e atribuindo o valor "Allan" (string)

        // imprimindo valores
        System.out.println(nota);
        System.out.println(nome + " -> " + nota);

        int numeroDePessoas = 10; // formato (Camel Case)

        // variaveis sem tipo, mas a memoria consegue identificar pelo o valor atibuido
        var x = 5;
        var y = "abc";
        var z = 2.2;
        var w = true;

        // mudando o valor de "x" de 5 para 3
        x = 3;


    }
}