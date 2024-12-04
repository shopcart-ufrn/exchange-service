package br.edu.ufrn.exchange.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufrn.exchange.dtos.ExchangeResponseDTO;
import br.edu.ufrn.exchange.services.ExchangeService;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    @Autowired
    private ExchangeService exchangeService;

    @GetMapping
    public ResponseEntity<ExchangeResponseDTO> getExchange() {

        ExchangeResponseDTO responseDTO = exchangeService.getExchange();

        return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
    }

}
