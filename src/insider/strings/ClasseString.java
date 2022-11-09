package insider.strings;

public class ClasseString {
    public static void main(String[] args) {

        // variaveis apontando para um objeto igual
        String r1 = "abc";
        String r2 = "abc";
        System.out.println(r1);
        System.out.println(r2);

        // cada variavel apontando para um objeto diferente
        String s1 = "abc";
        String s2 = new String("abc");  // criando um novo objeto String
        System.out.println(s1);
        System.out.println(s2);

        // s2 = s2.intern();  fazendo "s2" apontar para o mesmo objeto que "s1"

        // comparar strings
        if (s1.equals(s2)) {
            System.out.println("IGUAIS");
        }else {
            System.out.println("DIFERENTES");
        }
    }
}
