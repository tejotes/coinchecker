package com.tejotes.coinchecker.walletinfo.api;

import java.util.List;

public interface Wallet {

    String refid();

    String name();

    List<CoinQuantity> balanceList();

    void addCoins(CoinQuantity quantity);

    interface Builder {
        Wallet build();
        Builder setRefid(String refid);
        Builder setName(String name);
    }
}
