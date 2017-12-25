package com.tejotes.coinchecker.test;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class CmcCoinInfo {

    private String id;

    private String name;

    private String symbol;

    private Integer rank;

    @SerializedName("price_usd")
    private Double priceUsd;

    @SerializedName("price_btc")
    private Double priceBtc;

    @SerializedName("24h_volume_usd")
    private Double volume24hUsd;

    @SerializedName("market_cap_usd")
    private Double marketCapUsd;

    @SerializedName("available_supply")
    private Double availableSupply;

    @SerializedName("total_supply")
    private Double totalSupply;

    @SerializedName("max_supply")
    private Double maxSupply;

    @SerializedName("last_updated")
    private Date lastUpdated;

    @SerializedName("price_eur")
    private Double priceEur;

    @SerializedName("market_cap_eur")
    private Double marketCapEur;

    @SerializedName("percent_change_1h")
    private Double delta1hPct;

    @SerializedName("percent_change_24h")
    private Double delta1dPct;

    @SerializedName("percent_change_7d")
    private Double delta7dPct;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Double getPriceUsd() {
        return priceUsd;
    }

    public void setPriceUsd(Double priceUsd) {
        this.priceUsd = priceUsd;
    }

    public Double getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(Double priceBtc) {
        this.priceBtc = priceBtc;
    }

    public Double getVolume24hUsd() {
        return volume24hUsd;
    }

    public void setVolume24hUsd(Double volume24hUsd) {
        this.volume24hUsd = volume24hUsd;
    }

    public Double getMarketCapUsd() {
        return marketCapUsd;
    }

    public void setMarketCapUsd(Double marketCapUsd) {
        this.marketCapUsd = marketCapUsd;
    }

    public Double getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(Double availableSupply) {
        this.availableSupply = availableSupply;
    }

    public Double getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(Double totalSupply) {
        this.totalSupply = totalSupply;
    }

    public Double getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(Double maxSupply) {
        this.maxSupply = maxSupply;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Double getPriceEur() {
        return priceEur;
    }

    public void setPriceEur(Double priceEur) {
        this.priceEur = priceEur;
    }

    public Double getMarketCapEur() {
        return marketCapEur;
    }

    public void setMarketCapEur(Double marketCapEur) {
        this.marketCapEur = marketCapEur;
    }

    public Double getDelta1hPct() {
        return delta1hPct;
    }

    public void setDelta1hPct(Double delta1hPct) {
        this.delta1hPct = delta1hPct;
    }

    public Double getDelta1dPct() {
        return delta1dPct;
    }

    public void setDelta1dPct(Double delta1dPct) {
        this.delta1dPct = delta1dPct;
    }

    public Double getDelta7dPct() {
        return delta7dPct;
    }

    public void setDelta7dPct(Double delta7dPct) {
        this.delta7dPct = delta7dPct;
    }

    @Override
    public String toString() {
        return "CmcCoinInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", rank=" + rank +
                ", priceUsd=" + priceUsd +
                ", priceBtc=" + priceBtc +
                ", volume24hUsd=" + volume24hUsd +
                ", marketCapUsd=" + marketCapUsd +
                ", availableSupply=" + availableSupply +
                ", totalSupply=" + totalSupply +
                ", maxSupply=" + maxSupply +
                ", lastUpdated=" + lastUpdated +
                ", priceEur=" + priceEur +
                ", marketCapEur=" + marketCapEur +
                '}';
    }
}
