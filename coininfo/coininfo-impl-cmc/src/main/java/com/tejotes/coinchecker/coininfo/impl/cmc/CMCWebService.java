package com.tejotes.coinchecker.coininfo.impl.cmc;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.logging.Logger;

public class CMCWebService {

    final private Logger logger = Logger.getLogger(CMCWebService.class.getName());

    /**
     * get coinInfo for a specific coin
     *
     * @param coinId
     * @return
     * @throws Exception
     */
    public CoinInfoCMC info4coinId(String coinId) throws Exception {
        // check params
        if (coinId == null || coinId.isEmpty()) {
            throw new IllegalArgumentException("coinId == null or empty: " + coinId);
        }

        // call webservice
        String urlPath = String.format(CMCStatic.SINGLE_COIN_EUR_URL, coinId);
        CoinInfoCMC[] coinInfoArray = executeWebserviceCall(urlPath);

        // check result
        CoinInfoCMC coinInfo = ((coinInfoArray != null) && (coinInfoArray.length == 1)) ? coinInfoArray[0] : null;
        return coinInfo;
    }

    /**
     * get coinInfo for top 100 coins
     * @return
     * @throws Exception
     */
    public CoinInfoCMC[] info4first100() throws Exception {
        // call webservice
        String urlPath = CMCStatic.FIRST_100_COIN_EUR_URL;
        CoinInfoCMC[] coinInfoArray = executeWebserviceCall(urlPath);

        // return result
        return coinInfoArray;
    }

    /**
     * build and execute webservicecall by given url
     *
     * @param urlPath
     * @return
     * @throws Exception
     */
    private CoinInfoCMC[] executeWebserviceCall(String urlPath) throws Exception {
        long startMillis = System.currentTimeMillis();
        URL url = new URL(urlPath);

        InputStream inputStream = url.openStream();
        Reader reader = new InputStreamReader(inputStream, "UTF-8");

        Gson gson = CMCStatic.GSON;
        CoinInfoCMC[] cmcCoinInfo = gson.fromJson(reader, CoinInfoCMC[].class);

        long durationMillis = System.currentTimeMillis() - startMillis;
        String msg = String.format("executeWebserviceCall(url = '%s'): duration=%d[ms]", urlPath, durationMillis);
        logger.info(msg);

        return cmcCoinInfo;
    }

}
