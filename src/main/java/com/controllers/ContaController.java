package com.controllers;


import com.dto.ContaDto;
import com.dto.ContaForm;
import com.models.Conta;
import com.service.ContaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {

    @Autowired
    private ContaServices contaServices;


    @PostMapping(value = "/criar")
    public ResponseEntity<ContaDto> criarConta(@RequestBody ContaForm contaForm) {
        Conta conta = contaServices.criarConta(contaForm.converte());
        return new ResponseEntity<>(ContaDto.converter(conta), HttpStatus.CREATED);
    }

    @GetMapping("/info/{numero}/{agencia}")
    public Conta contaInfo(@PathVariable String numero, @PathVariable String agencia) {
        return contaServices.infoConta(numero, agencia);
    }

    @GetMapping(value = "/all")
    public List<Conta> exibirContas(){
        return contaServices.mostrarContas();
    }

    @GetMapping(value = "/saldo/{numero}/{agencia}")
    public Double consultarSaldo(@PathVariable String numero, @PathVariable String agencia) {
        return contaServices.cosultarSaldo(numero, agencia);
    }

    @GetMapping(value = "/saque/{numero}/{agencia}/{valor}")
    public Double saque(@PathVariable String numero, @PathVariable String agencia, @PathVariable Double valor){
        return contaServices.realizarSaque(numero, agencia, valor);
    }

    @GetMapping(value = "/deposito/{numero}/{agencia}/{valor}")
    public Double deposito(@PathVariable String numero, @PathVariable String agencia, @PathVariable Double valor){
        return contaServices.fazerDeposito(numero, agencia, valor);
    }

    @GetMapping(value = "/investimento/{numero}/{agencia}/{valor}")
    public Double investimento(@PathVariable String numero, @PathVariable String agencia, @PathVariable Double valor){
        return contaServices.fazerInvestimento(numero, agencia, valor);
    }

    @GetMapping(value = "/transferencia/{numero}/{agencia}/{valor}")
    public Double transferencia(@PathVariable String numero, @PathVariable String agencia, @PathVariable Double valor){
        return contaServices.realizarTransferencia(numero, agencia, valor);
    }


}
