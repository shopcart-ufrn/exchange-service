package br.edu.ufrn.exchange.dtos;

public class ExchangeResponseDTO {
    
    private Double usd = Double.valueOf(1.0);

    private String to;
    private Double rate;

    public ExchangeResponseDTO() {};

    public ExchangeResponseDTO(String to, Double rate) {
        this.to = to;
        this.rate = rate;
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

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

}
