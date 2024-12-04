package br.edu.ufrn.exchange.services;

import java.util.Random;

import org.springframework.stereotype.Service;

import br.edu.ufrn.exchange.dtos.ExchangeResponseDTO;

@Service
public class ExchangeService {

    private final Random random = new Random();

    public void stop(Integer exitCode) {
        Runtime.getRuntime().halt(exitCode);
    }

    public ExchangeResponseDTO getExchange() {
        Integer randomInt = random.nextInt(1, 11);

        if (randomInt == 1) {
            this.stop(randomInt);
        }

        return new ExchangeResponseDTO("BRL", Double.valueOf(randomInt));
    }

}
