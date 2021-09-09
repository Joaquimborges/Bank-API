package com.service;

import com.models.Conta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Service
public class ContaServices {
    private static List<Conta> contas  = new ArrayList<>();


    public static void setContas(List<Conta> contas) {
        ContaServices.contas = contas;
    }


    public ContaServices() {
    }



    public Conta criarConta(Conta conta) {
       contas.add(conta);
        return conta;
    }


    public static String infoConta(String numero, String agencia) {
        for (Conta contaData : contas) {
            if (contaData.getNumero().equals(numero) && contaData.getAgencia().equals(agencia)) {
                return contaData.toString();
            }
        }
        return null;

    }

    public static Double cosultarSaldo(String numero, String agencia) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                return conta.getSaldo();
            }
        }
        return null;
    }


    public static Double realizarSaque(String numero, String agencia, Double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                if (valor < conta.getSaldo()) {
                    return conta.getSaldo() - valor;
                } else {
                    if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia) && conta.isEspecial()) {
                        double valorSaque = conta.getSaldo() + conta.getChequeEspecial();
                        if (valor < valorSaque) {
                            return conta.getSaldo() - valor;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static Double fazerDeposito(String numero, String agencia, Double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                return conta.getSaldo() + valor;
            }
        }
        return null;
    }

    public static Double fazerInvestimento(String numero, String agencia, double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                if (conta.getSaldo() > valor) {
                    double retirarSaldo = conta.getSaldo() - valor;
                    return conta.getInvestimento() + retirarSaldo;
                }

            }
        }
        return null;
    }


    private static double auxTransfer(Conta conta, Double valor){
        return conta.getSaldo() + valor;
    }


    public static Double realizarTransferencia (String numero, String agencia, Double valor){
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                return ContaServices.auxTransfer(conta, valor);
            }
        }
        return null;
    }

    public static HashMap<Integer, Conta> mostrarContas() {
        HashMap<Integer, Conta> contaHashMap = new HashMap<>();
        Integer contador = 0;
        for (Conta conta : contas) {
            contador++;
            contaHashMap.put(contador ,conta);
        }
        return contaHashMap;
    }








}