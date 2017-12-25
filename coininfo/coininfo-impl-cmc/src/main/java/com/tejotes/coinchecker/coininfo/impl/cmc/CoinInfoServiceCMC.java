package com.tejotes.coinchecker.coininfo.impl.cmc;

import com.tejotes.coinchecker.coininfo.api.CoinInfo;
import com.tejotes.coinchecker.coininfo.api.CoinInfoService;

import javax.inject.Inject;

public class CoinInfoServiceCMC implements CoinInfoService {

    @Inject
    private CMCWebService webService;

    @Override
    public CoinInfo info4coinId(String coinId) {
        // declare result
        CoinInfo coinInfo = null;

        // call webservice
        try {
            coinInfo =webService.info4coinId(coinId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // return result
        return coinInfo;
    }
}
