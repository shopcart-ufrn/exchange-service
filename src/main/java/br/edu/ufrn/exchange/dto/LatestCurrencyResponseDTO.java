package br.edu.ufrn.exchange.dto;

import java.util.Map;

public class LatestCurrencyResponseDTO {
    private Map<String, Float> data;

    public LatestCurrencyResponseDTO() {};

    public LatestCurrencyResponseDTO(Map<String, Float> data) {
        this.data = data;
    }

    public Map<String, Float> getData() {
        return data;
    }

    public void setData(Map<String, Float> data) {
        this.data = data;
    }

    public Float getCurrentRate(String currency) {
        return this.data.get(currency);
    }
}
