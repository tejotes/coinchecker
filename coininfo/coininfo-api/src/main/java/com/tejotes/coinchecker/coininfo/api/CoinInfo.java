package com.tejotes.coinchecker.coininfo.api;

import java.util.Date;

public interface CoinInfo {

    String id();

    String name();

    String symbol();

    Integer rank();

    Double priceUsd();

    Double priceBtc();

    Double volume24hUsd();

    Double marketCapUsd();

    Double availableSupply();

    Double delta1hPct();

    Double delta1dPct();

    Double delta7dPct();

    Double totalSupply();

    Double maxSupply();

    Date lastUpdated();

    Double priceEur();

    Double marketCapEur();
}
