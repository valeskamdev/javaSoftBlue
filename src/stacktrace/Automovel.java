package stacktrace;

public class Automovel {

    private static final int VELOCIDADE_MAXIMA = 180;
    private int velocidadeAtual;

    // lancando uma exceção se a velocidade for maior que a velocidade máxima
    public void acelerar(int velocidade) throws AcimaVelocidadeMaximaException {

        if (velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
            throw new AcimaVelocidadeMaximaException("Excedeu a velocidade máxima");  // lançando uma exceção
        }
        velocidadeAtual += velocidade;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
