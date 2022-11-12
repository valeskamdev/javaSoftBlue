package erros;

public class Aplicacao {
    public static void main(String[] args) {

        // criando um objeto "ContatoPF" e configurando seus atributos
        ContatoPJ pessoaPJ = new ContatoPJ();
        pessoaPJ.setName("Allan");
        pessoaPJ.getEndereco().setRua("R. dos Limões");
        pessoaPJ.getEndereco().setNumero("97");
        pessoaPJ.getEndereco().setCidade("Ribeirão Distante");
        pessoaPJ.getEndereco().setEstado("Naguará");
        pessoaPJ.setCnpj("05.006.456/0001-45");

        System.out.println("Contato finalizado!");

        // criando um objeto Agenda, definindo o primeiro contato para o objeto 'contatoPF' e chamando o método
        Agenda agenda = new Agenda();
        agenda.setContato1(pessoaPJ);
        imprimirNomes(agenda);
        imprimirCnpj(agenda);

        System.out.println("Contato finalizado!");
    }

    // imprimindo nome do contato se não for nulo
    private static void imprimirNomes(Agenda agenda) {
        if (agenda.getContato1() != null) {
            System.out.println(agenda.getContato1().getName());
        }

        if (agenda.getContato2() != null) {
            System.out.println(agenda.getContato2().getName());
        }

        if (agenda.getContato3() != null) {
            System.out.println(agenda.getContato3().getName());
        }
    }

    /* verifica se os contatos não são nulos e se é uma instância do tipo "ContatoPJ" se for,
      cria uma nova variável chamada "contatoPJ" que é uma instância de "ContatoPJ" */
    private static void imprimirCnpj(Agenda agenda) {

        if (agenda.getContato1() != null && agenda.getContato1() instanceof ContatoPJ) {
            ContatoPJ contatoPJ = (ContatoPJ) agenda.getContato1();  //casting
            System.out.println(contatoPJ.getCnpj());
        }

        if (agenda.getContato2() != null) {
            ContatoPJ contatoPJ2 = (ContatoPJ) agenda.getContato2();
            System.out.println(contatoPJ2.getCnpj());
        }

        if (agenda.getContato3() != null) {
            ContatoPJ contatoPJ3 = (ContatoPJ) agenda.getContato3();
            System.out.println(contatoPJ3.getCnpj());
        }
    }
}
