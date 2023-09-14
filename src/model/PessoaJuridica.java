package src.model;

public class PessoaJuridica extends Cliente {


    public PessoaJuridica(String nome, String CNPJ) {
        super(nome, CNPJ);
    }

    public double desconto() {
        return 10 / 100d;
    }

    @Override
    public String tipo() {
        return "PJ";
    }
}
