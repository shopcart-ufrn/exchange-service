package br.edu.ufrn.exchange.dtos;

public class ExchangeResponseDTO {
    
    private Double usd = Double.valueOf(1.0);

    private String to;
    private Double value;

    public ExchangeResponseDTO() {};

    public ExchangeResponseDTO(String to, Double value) {
        this.to = to;
        this.value = value;
    }

    public Double getUsd() {
        return this.usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Double getValue() {
        return this.value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
