package src.model;

public class PessoaJuridica extends Cliente {

    PessoaFisica pessoaFisica;

    public PessoaJuridica(String nome, String CNPJ, PessoaFisica pessoaFisica) {
        super(nome, CNPJ);
        this.pessoaFisica = pessoaFisica;
    }

    public double desconto() {
        return 10 / 100d;
    }

    @Override
    public String tipo() {
        return "PJ";
    }
}
