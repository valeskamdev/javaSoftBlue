package stacktrace;

public class Pista {

    public void iniciar() throws PistaException {
        Automovel automovel = new Automovel();

        try {
            automovel.acelerar(100);
            automovel.acelerar(90);
            int valocidade = automovel.getVelocidadeAtual();
            System.out.println("Sua velocidade: " + valocidade + "km");
        } catch (AcimaVelocidadeMaximaException e) {
            throw new PistaException("Problema na pista " + e);
        }
    }
}
