package br.edu.ufrn.exchange.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import br.edu.ufrn.exchange.dto.ExchangeResponseDTO;

@Service
public class ExchangeService {

    private final Random random = new Random();

    private void stop(Integer exitCode) {
        Runtime.getRuntime().halt(exitCode);
    }

    private void decideIfStops() {
        Integer randomInt = random.nextInt(1, 11);

        if (randomInt == 1) {
            this.stop(randomInt);
        }
    }

    private Double getRandomRate(Double from, Double to) {
        return from + (to - from) * Math.random();
    }

    public ExchangeResponseDTO getExchange() {
        this.decideIfStops();

        String currency = "BRL";

        Double rate = this.getRandomRate(
            Double.valueOf(5.0),
            Double.valueOf(7.0)
            );
    
        return new ExchangeResponseDTO(currency, rate);
    }



}
