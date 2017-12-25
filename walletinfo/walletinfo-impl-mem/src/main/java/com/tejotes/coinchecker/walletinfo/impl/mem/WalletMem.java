package com.tejotes.coinchecker.walletinfo.impl.mem;

import com.tejotes.coinchecker.walletinfo.api.CoinQuantity;
import com.tejotes.coinchecker.walletinfo.api.Wallet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WalletMem implements Wallet {

    private String refid;

    private String name;

    private List<CoinQuantity> coinList;

    public void addCoins(CoinQuantity quantity) {
        // check params
        if (quantity == null) {
            throw new IllegalArgumentException("quantity == null");
        }

        // get list
        if (this.coinList == null) {
            this.coinList = new ArrayList<>();
        }

        // add coins
        this.coinList.add(quantity);
    }

    @Override
    public String refid() {
        return this.refid;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public List<CoinQuantity> balanceList() {
        return (coinList == null) ? Collections.emptyList() : Collections.unmodifiableList(coinList);
    }

    @Override
    public String toString() {
        return "WalletMem{" +
                "refid='" + refid + '\'' +
                ", name='" + name + '\'' +
                ", coinList=" + coinList +
                '}';
    }

    String getRefid() {
        return refid;
    }

    void setRefid(String refid) {
        this.refid = refid;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
