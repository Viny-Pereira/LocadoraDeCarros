package src.model;

public class PessoaFisica extends Cliente {
    private int idade;

    public PessoaFisica(String nome, String CPF, int idade) {
        super(nome, CPF);
        this.idade = idade;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
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
