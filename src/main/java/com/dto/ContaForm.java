package com.dto;

import com.models.Conta;

import java.io.Serializable;

public class ContaForm implements Serializable {

    private String nome;
    private String numero;
    private String agencia;
    private String tipoDeConta;
    private double saldo;
    private boolean especial;
    private double chequeEspecial;

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

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
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

    public ContaForm() {
    }

    public ContaForm(String nome, String numero, String agencia, String tipoDeConta, double saldo, boolean especial, double chequeEspecial) {
        this.nome = nome;
        this.numero = numero;
        this.agencia = agencia;
        this.tipoDeConta = tipoDeConta;
        this.saldo = saldo;
        this.especial = especial;
        this.chequeEspecial = chequeEspecial;
    }

    public Conta converte() {
        return new Conta(nome, agencia, numero, tipoDeConta, saldo, especial, chequeEspecial);
    }


}
