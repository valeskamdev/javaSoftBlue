package erros;

public abstract class Contato {

    public boolean getCpf;
    private String name;
    private Endereco endereco = new Endereco();  // instanciando a classe Endereco

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
