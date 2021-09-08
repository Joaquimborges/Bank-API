package com.models;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nome, String numero, String agencia, String tipoDeConta, double saldo, boolean especial, double investimento) {
        super(nome, numero, agencia, tipoDeConta, saldo, especial, investimento);
    }
}
