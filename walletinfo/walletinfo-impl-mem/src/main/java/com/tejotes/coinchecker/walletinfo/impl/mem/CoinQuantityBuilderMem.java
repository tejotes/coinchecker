package com.tejotes.coinchecker.walletinfo.impl.mem;

import com.tejotes.coinchecker.walletinfo.api.CoinQuantity;

import java.util.Date;

public class CoinQuantityBuilderMem implements CoinQuantity.Builder {

    private CoinQuantityMem coinQuantity = new CoinQuantityMem();

    @Override
    public CoinQuantity build() {
        CoinQuantity result = coinQuantity;
        coinQuantity = new CoinQuantityMem();
        return result;
    }

    @Override
    public CoinQuantity.Builder setCoinId(String coinId) {
        coinQuantity.setCoinId(coinId);
        return this;
    }

    @Override
    public CoinQuantity.Builder setValueDate(Date valueDate) {
        coinQuantity.setValueDate(valueDate);
        return this;
    }

    @Override
    public CoinQuantity.Builder setQuantity(double balanceQuantity) {
        coinQuantity.setQuantity(balanceQuantity);
        return this;
    }
}
