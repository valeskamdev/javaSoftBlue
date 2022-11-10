package insider.exceptions;

public class Banco {

    /* se o usuário tentar sacar um valor negativo, ou se o usuário tentar
    sacar mais dinheiro do que tem, o programa imprimirá "ERRO" */
    public void realizarOperacao() {

        ContaBancaria conta = new ContaBancaria();

        try {
            conta.sacar(190);
            conta.sacar(80);

            double saldo = conta.getSaldo();
            System.out.println("Saldo: " + saldo);

        } catch (ValorNegativoException | SaldoInsuficienteException e) {  // pegando as duas exceções
            System.out.println("ERRO");
        } catch (Exception e) {  // capturando todas as exceções
            System.out.println("Houve algum erro: " + e);
        } finally {  // bloco que é sempre executado, mesmo que haja uma exceção
            System.out.println("Fim do saque");
        }
    }
}
