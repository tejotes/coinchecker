package com.tejotes.coinchecker.test;


import com.google.gson.*;
import org.junit.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.*;

public class CmcHttpTest {

    private final String baseUrl = "https://api.coinmarketcap.com/v1/ticker/%s/?convert=EUR";

    private final String first100Url = "https://api.coinmarketcap.com/v1/ticker/?convert=EUR";

    private final Gson gson = new GsonBuilder()
            .registerTypeAdapter(Date.class, (JsonDeserializer<Date>) (json, typeOfT, context) -> new Date(json.getAsJsonPrimitive().getAsLong() * 1000))
            .registerTypeAdapter(Date.class, (JsonSerializer<Date>) (date, type, jsonSerializationContext) -> new JsonPrimitive(date.getTime() / 1000))
            .create();


    @Test
    public void testMonero() throws Exception {

        String path = String.format(baseUrl, "monero");
        URL url = new URL(path);

        InputStream input = url.openStream();
        Reader reader = new InputStreamReader(input, "UTF-8");

        CmcCoinInfo[] cmcCoinInfo = gson.fromJson(reader, CmcCoinInfo[].class);
        CmcCoinInfo moneroInfo = cmcCoinInfo[0];

        String msg = String.format("coininfo=%s", cmcCoinInfo);
        System.out.println(msg);

        Double moneroCount = 0.074044698;
        Double moneroEUR = moneroCount * moneroInfo.getPriceEur();
        System.out.println("moneroEUR="+moneroEUR);
    }

    @Test
    public void testAll() throws Exception {
        URL url = new URL(first100Url);
        InputStream input = url.openStream();
        Reader reader = new InputStreamReader(input, "UTF-8");

        CmcCoinInfo[] cmcCoinInfoArray = gson.fromJson(reader, CmcCoinInfo[].class);

        Map<String, CmcCoinInfo> coininfoMap = new HashMap<>(200);
        for (CmcCoinInfo cmcCoinInfo : cmcCoinInfoArray) {
            coininfoMap.put(cmcCoinInfo.getId(), cmcCoinInfo);
        }

        List<CoinValue> coinValueList = new ArrayList<>(20);
        coinValueList.add(new CoinValue("bitcoin", 0.01447147812));
        coinValueList.add(new CoinValue("ethereum", 0.00445992880));
        coinValueList.add(new CoinValue("bitcoin-cash", 0.01418459812));
        coinValueList.add(new CoinValue("bitcoin-gold", 0.01423370212));
        coinValueList.add(new CoinValue("ripple", 1.04993000000));
        coinValueList.add(new CoinValue("iota", 28.699000099));
        coinValueList.add(new CoinValue("monero", 0.07404469817));
        coinValueList.add(new CoinValue("zcash", 0.00055643067));
        coinValueList.add(new CoinValue("bitshares", 15.23112816));
        coinValueList.add(new CoinValue("byteball", 0.00223700000));
        coinValueList.add(new CoinValue("dash", 0.004));

        double sum = 0.0;
        for (CoinValue coinValue : coinValueList) {
            CmcCoinInfo coinInfo = coininfoMap.get(coinValue.getCoinId());
            double value = coinValue.getCoinQuantity() * coinInfo.getPriceEur();
            sum += value;
            String msg = String.format("%12s: %8.3fCU %10.4fEUR/CU (Δh=%+6.2f%% Δd=%+6.2f%% Δw=%+6.2f%%) %8.3fEUR sum=%8.3fEUR",coinInfo.getId(), coinValue.getCoinQuantity(), coinInfo.getPriceEur(), coinInfo.getDelta1hPct(), coinInfo.getDelta1dPct(), coinInfo.getDelta7dPct(), value ,sum);
            System.out.println(msg);
        }
    }
}
