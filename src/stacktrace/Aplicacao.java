package stacktrace;

public class Aplicacao {
    public static void main(String[] args) {

        Pista pista = new Pista();

        try {
            pista.iniciar();
        } catch (PistaException e) {
            e.printStackTrace();
        }
    }
}
