package com.tejotes.coinchecker.coininfo.impl.cmc;

import com.tejotes.coinchecker.coininfo.api.CoinInfo;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class CoinInfoCMC implements CoinInfo {

    @Override
    public String id() {
        return this.id;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String symbol() {
        return this.symbol;
    }

    @Override
    public Integer rank() {
        return this.rank;
    }

    @Override
    public Double priceUsd() {
        return this.priceUsd;
    }

    @Override
    public Double priceBtc() {
        return this.priceBtc;
    }

    @Override
    public Double volume24hUsd() {
        return this.volume24hUsd;
    }

    @Override
    public Double marketCapUsd() {
        return this.marketCapUsd;
    }

    @Override
    public Double availableSupply() {
        return this.availableSupply;
    }

    @Override
    public Double totalSupply() {
        return this.totalSupply;
    }

    @Override
    public Double maxSupply() {
        return this.maxSupply;
    }

    @Override
    public Date lastUpdated() {
        return this.lastUpdated;
    }

    @Override
    public Double priceEur() {
        return this.priceEur;
    }

    @Override
    public Double marketCapEur() {
        return this.marketCapEur;
    }

    @Override
    public Double delta1hPct() {
        return this.delta1hPct;
    }

    @Override
    public Double delta1dPct() {
        return this.delta1dPct;
    }

    @Override
    public Double delta7dPct() {
        return this.delta7dPct;
    }


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
