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

@RequestMapping(value = "/conta")
@RestController
public class ContaController {

    @Autowired
    private ContaServices contaServices;


    @PostMapping(value = "/criar")
    public ResponseEntity<ContaDto> criarConta(@RequestBody ContaForm contaForm) {
        Conta conta = contaServices.criarConta(contaForm.converte());
        System.out.println(contaForm);

        return new ResponseEntity<>(ContaDto.converter(conta), HttpStatus.CREATED);
    }

    @GetMapping(value = "/all")
    public HashMap<Integer, Conta> exibirContas(){
        return ContaServices.mostrarContas();
    }

}
