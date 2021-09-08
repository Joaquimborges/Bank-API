package com.models;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
    }

    public ContaCorrente(String nome, String numero, String agencia, String tipoDeConta, double saldo, boolean especial, double chequeEspecial) {
        super(nome, numero, agencia, tipoDeConta, saldo, especial, chequeEspecial);
    }


}


