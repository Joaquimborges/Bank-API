package com.service;

import com.models.Conta;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Setter
public class ContaServices {
    private List<Conta> contas  = new ArrayList<>();


    public Conta criarConta(Conta conta) {
       contas.add(conta);
        return conta;
    }


    public Conta infoConta(String numero, String agencia) {
        for (Conta contaData : contas) {
            if (contaData.getNumero().equals(numero) && contaData.getAgencia().equals(agencia)) {
                return contaData;
            }
        }
        return null;

    }

    public Double cosultarSaldo(String numero, String agencia) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                return conta.getSaldo();
            }
        }
        return null;
    }


    public Double realizarSaque(String numero, String agencia, Double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                if (valor < conta.getSaldo()) {
                    return conta.getSaldo() - valor;
                } else {
                    if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia) && conta.isEspecial()) {
                        double valorSaque = conta.getSaldo() + conta.getChequeEspecial();
                        if (valor <
                                valorSaque) {
                        return conta.getSaldo() - valor;
                        }
                    }
                }
            }
        }
        return null;
    }

    public Double fazerDeposito(String numero, String agencia, Double valor) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                return conta.getSaldo() + valor;
            }
        }
        return null;
    }

    public Double fazerInvestimento(String numero, String agencia, Double valor) {
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


    private double auxTransfer(Conta conta, Double valor){
        return conta.getSaldo() + valor;
    }


    public Double realizarTransferencia (String numero, String agencia, Double valor){
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero) && conta.getAgencia().equals(agencia)) {
                return auxTransfer(conta, valor);
            }
        }
        return null;
    }

    public List< Conta> mostrarContas() {
        return contas;
    }








}