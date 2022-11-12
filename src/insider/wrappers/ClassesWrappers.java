package insider.wrappers;

import java.util.ArrayList;
import java.util.List;

public class ClassesWrappers {
    public static void main(String[] args) {

        /*
                   WRAPPER

          PRIMITIVOS       CLASSES

            int      -->   Integer
            boolean  -->   Boolean
            double   -->   Double
         */

         int i = 10;

       // convertendo um int em um objeto Integer e depois de volta em um int
        Integer integer = Integer.valueOf(i);  // convertendo um int em um objeto Integer
        i = integer.intValue();  // convertendo o objeto "Integer" de volta para um "int" primitivo
        System.out.println(i);

        double d = null;   //tipos primitivos não podem recerber "null" como valor, apenas tipos de classe
        Double d2 = null; // aceita valor null

       // usar wrapper para trabalhar com colecoes

        // List<int> list = new ArrayList<>()   tipos primitivos não criam lista
        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        list.add(Integer.valueOf(3));
        System.out.println(list);

        print(Integer.valueOf(20));

        // autoboxing, conversão entre tipos primitivos de dados
        Integer x = 20;  // Integer x = Integer.valueOf(20)
        x++; // int temp = x.intValue(); , temp++;  , x = Integer.valueOf(temp);
        System.out.println(x);

        print(true);

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        for (int elementos : lista) {
            System.out.println(elementos);
        }

        // autoboxing, conversão entre tipos de dados primitivos
        Integer abc = Integer.valueOf(50);
        int cba = abc;
        System.out.println(cba);

        // não converter Integer null paa tipo primitivo:
        Integer w = null;
        int w2 = w;
    }

    // método que imprime objetos
    public static void print(Object obj) {
        System.out.println(obj);
    }
}















