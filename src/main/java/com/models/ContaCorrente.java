package com.models;

public class ContaCorrente extends Conta {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaCorrente(String numero, String agencia, String nome) {
        super(numero, agencia);
        this.nome = nome;
    }

    public ContaCorrente(String numero, String agencia, double saldo, boolean especial, String nome) {
        super(numero, agencia, saldo, especial);
        this.nome = nome;
    }
}


