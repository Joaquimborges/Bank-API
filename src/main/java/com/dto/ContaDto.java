package com.dto;

import com.models.Conta;

import java.io.Serializable;

public class ContaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String agencia;
    private String numero;
    private String tipoDeConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
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

    public ContaDto() {
    }

    public ContaDto(String nome, String agencia, String numero, String tipoDeConta) {
        this.nome = nome;
        this.agencia = agencia;
        this.numero = numero;
        this.tipoDeConta = tipoDeConta;
    }


    public static ContaDto converter(Conta conta) {
        return new ContaDto(conta.getNome(), conta.getNumero(), conta.getAgencia(), conta.getTipoDeConta());
    }
}
