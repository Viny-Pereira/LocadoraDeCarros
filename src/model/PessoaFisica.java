package src.model;

public class PessoaFisica extends Cliente {
    private String idade;

    public PessoaFisica(String nome, String CPF, String idade) {
        super(nome, CPF);
        this.idade = idade;
    }


    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public double desconto() {
        return 5 / 100d;
    }

    @Override
    public String tipo() {
        return "PF";
    }
}
