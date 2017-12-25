package com.tejotes.coinchecker.walletinfo.api;

import java.util.Date;

public interface CoinQuantity {

    String coinId();

    Date valueDate();

    double quantity();

    interface Builder {
        CoinQuantity build();
        Builder setCoinId(String coinId);
        Builder setValueDate(Date valueDate);
        Builder setQuantity(double quantity);
    }

}
