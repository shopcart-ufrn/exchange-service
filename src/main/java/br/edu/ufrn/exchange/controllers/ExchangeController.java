package br.edu.ufrn.exchange.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ufrn.exchange.dtos.ExchangeResponseDTO;

@RestController
@RequestMapping("/exchange")
public class ExchangeController {

    @GetMapping
    public ResponseEntity<ExchangeResponseDTO> getExchange() {
        ExchangeResponseDTO exchangeResponseDTO = new ExchangeResponseDTO(
            "BRL", Double.valueOf(6.0)
        );

        return ResponseEntity.status(HttpStatus.OK).body(exchangeResponseDTO);
    }

}
