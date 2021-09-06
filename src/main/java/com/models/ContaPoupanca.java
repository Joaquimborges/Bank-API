package com.models;

public class ContaPoupanca extends Conta{

    private String nome;
    private double investimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public ContaPoupanca(String numero, String agencia, String nome, double investimento) {
        super(numero, agencia);
        this.nome = nome;
        this.investimento = investimento;
    }

}
