package com.controllers;

import com.models.Conta;
import com.service.ContaServices;


public class Teste {
    public static void main(String[] args) {


        Conta conta = new Conta();
        conta.setNumero("12334");
        conta.setAgencia("1234");
        conta.setEspecial(true);
        conta.setSaldo(100.0);
        conta.setChequeEspecial(10.0);

        ContaServices.criarConta(conta);
        System.out.println(ContaServices.mostrarContas());






    }
}
