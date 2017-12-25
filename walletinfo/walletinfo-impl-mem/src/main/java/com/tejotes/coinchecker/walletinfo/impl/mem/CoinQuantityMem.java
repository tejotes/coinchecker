package com.tejotes.coinchecker.walletinfo.impl.mem;

import com.tejotes.coinchecker.walletinfo.api.CoinQuantity;

import java.util.Date;

public class CoinQuantityMem implements CoinQuantity {

    private String coinId;
    private Date valueDate = new Date();
    private double quantity;

    @Override
    public String coinId() {
        return coinId;
    }

    @Override
    public Date valueDate() {
        return valueDate;
    }

    @Override
    public double quantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "CoinQuantityMem{" +
                "coinId='" + coinId + '\'' +
                ", valueDate=" + valueDate +
                ", quantity=" + quantity +
                '}';
    }

    public String getCoinId() {
        return coinId;
    }

    public void setCoinId(String coinId) {
        this.coinId = coinId;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
