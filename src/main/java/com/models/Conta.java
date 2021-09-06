package com.models;

public class Conta {

    private String numero;
    private String agencia;
    private double saldo;
    private boolean especial;
    private double chequeEspecial;

    public Conta(String numero, String agencia, double saldo, boolean especial) {
    }

    public Conta() {
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public Conta(String numero, String agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    public Conta(String numero, String agencia, double saldo, boolean especial, double chequeEspecial) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.especial = especial;
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero='" + numero + '\'' +
                ", agencia='" + agencia + '\'' +
                ", saldo=" + saldo +
                ", especial=" + especial +
                ", chequeEspecial=" + chequeEspecial +
                '}';
    }
}
