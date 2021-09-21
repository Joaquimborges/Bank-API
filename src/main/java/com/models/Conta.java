package com.models;

public class Conta {

    private String nome;
    private String numero;
    private String agencia;
    private String tipoDeConta;
    private double saldo;
    private boolean especial;
    private double chequeEspecial;
    private double investimento;

    public Conta(String nome, String numero, String agencia, String tipoDeConta) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.tipoDeConta = tipoDeConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getInvestimento() {
        return investimento;
    }

    public void setInvestimento(double investimento) {
        this.investimento = investimento;
    }

    public Conta() {
    }

    public Conta(String nome, String numero, String agencia, String tipoDeConta, double saldo, boolean especial, double chequeEspecial, double investimento) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
        this.especial = especial;
        this.chequeEspecial = chequeEspecial;
        this.investimento = investimento;
    }


    public Conta(String nome, String numero, String agencia, String tipoDeConta, double saldo, boolean especial, double chequeEspecial) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
        this.especial = especial;
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome: '" + nome + '\n' +
                ", numero: '" + numero + '\n' +
                ", agencia: '" + agencia + '\n' +
                ", tipoDeConta: '" + tipoDeConta + '\n' +
                ", saldo: " + saldo + '\n' +
                ", especial: " + especial + '\n' +
                ", chequeEspecial: " + chequeEspecial + '\n' +
                ", investimento: " + investimento +
                '}';
    }
}
