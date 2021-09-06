package com.controllers;


import com.models.Conta;
import com.service.ContaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RequestMapping(value = "/conta")
@RestController
public class ContaController {

    @Autowired
  private ContaServices contaServices;


    @PostMapping(value = "/criar")
    public boolean criarConta(@RequestBody Conta conta) {
        return ContaServices.criarConta(conta);
    }

    @GetMapping(value = "/all")
    public HashMap<Integer, Conta> exibirContas(){
        return ContaServices.mostrarContas();
    }

}
