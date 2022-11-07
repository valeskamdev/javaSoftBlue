package logica.prioriadedeoperadores;

public class PrioriadeOperadores {
    public static void main(String[] args) {

        // x = 5 * 3 + √49 <= 100 OU NAO v E v

        // 1 - !
        // 2 - &&
        // 3 - ||

        boolean v = true;
        boolean x = 5 * 3 + Math.sqrt(7 * 7) <= 100 || !v && v;
        System.out.println(x);

    }
}
