package org.example;

public class Funcionario {
    private String nome;
    private boolean vendedor;
    private boolean gerente;

    public Funcionario(String nome, boolean vendedor, boolean gerente) {
        this.nome = nome;
        this.vendedor = vendedor;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVendedor() {
        return vendedor;
    }

    public void setVendedor(boolean vendedor) {
        this.vendedor = vendedor;
    }

    public boolean isGerente() {
        return gerente;
    }

    public void setGerente(boolean gerente) {
        this.gerente = gerente;
    }
}
