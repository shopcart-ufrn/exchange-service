package br.edu.ufrn.exchange.clients;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientException;

import br.edu.ufrn.exchange.dtos.LatestCurrencyResponseDTO;

@Component
public class FreeCurrencyAPI {
    @Value("${freecurrencyapi.baseUrl}")
    private String baseUrl;
    
    @Value("${freecurrencyapi.apiKey}")
    private String apiKey;

    private WebClient webClient;

    public FreeCurrencyAPI() {}

    private WebClient getWebClient() {
        if (this.webClient == null) {
            this.webClient = WebClient.builder()
            .baseUrl(this.baseUrl)
            .defaultHeader("apiKey", this.apiKey)
            .build();
        }

        return this.webClient;
    }

    public Double getCurrentRate (String currency) throws WebClientException {
        String endpoint = "/latest";

        WebClient client = this.getWebClient();

        LatestCurrencyResponseDTO response = client
            .get()
            .uri(uriBuilder -> uriBuilder
                .path(endpoint)
                .queryParam("currencies", currency)
                .build())
            .retrieve()
            .bodyToMono(LatestCurrencyResponseDTO.class)
            .block();

        Double currentRate = Double.valueOf(
            response.getCurrentRate(currency)
        );

        return currentRate;
    }

}
