package com.tejotes.coinchecker.test;

public class CoinValue {

    private String coinId;

    private double coinQuantity;

    public CoinValue(String coinId, double coinQuantity) {
        this.coinId = coinId;
        this.coinQuantity = coinQuantity;
    }

    public String getCoinId() {
        return coinId;
    }

    public void setCoinId(String coinId) {
        this.coinId = coinId;
    }

    public double getCoinQuantity() {
        return coinQuantity;
    }

    public void setCoinQuantity(double coinQuantity) {
        this.coinQuantity = coinQuantity;
    }
}
