package src.model;

public abstract class Cliente {
    private static int ultimoIdCliente = 0;
    private int id;
    private String nome;
    private String identificacao;

    private Cliente() {
    }

    public Cliente(String nome, String identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.id = ++ultimoIdCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract double desconto();

    public abstract String tipo();
}

