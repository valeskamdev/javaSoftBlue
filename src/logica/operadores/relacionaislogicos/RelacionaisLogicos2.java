package logica.operadores.relacionaislogicos;

public class RelacionaisLogicos2 {
    public static void main(String[] args) {

        // negacao (!) not
        boolean a = true;
        boolean b = !a;

        System.out.println(b);  // false

        //conjuncao (&&) and
        boolean c = true;
        boolean d = true;

        System.out.println(c && d);  // true

        // disjuncao (||) or
        boolean e = true;
        boolean f = false;

        System.out.println(e || f);  // true
    }
}
