package br.edu.ufrn.exchange.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufrn.exchange.client.FreeCurrencyAPI;
import br.edu.ufrn.exchange.dto.ExchangeResponseDTO;

@Service
public class ExchangeService {

    @Autowired
    private FreeCurrencyAPI freeCurrencyAPI;

    private final Random random = new Random();

    public void stop(Integer exitCode) {
        Runtime.getRuntime().halt(exitCode);
    }

    public ExchangeResponseDTO getExchange() {
        Integer randomInt = random.nextInt(1, 11);

        if (randomInt == 1) {
            this.stop(randomInt);
        }

        String currency = "BRL";

        Double rate;

        try {
            rate = freeCurrencyAPI.getCurrentRate(currency);
        } catch (RuntimeException e) {
            rate = Double.valueOf(6.1);
        }
    
        return new ExchangeResponseDTO(currency, rate);
    }

}
