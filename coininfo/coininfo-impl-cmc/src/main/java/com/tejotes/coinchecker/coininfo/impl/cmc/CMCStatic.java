package com.tejotes.coinchecker.coininfo.impl.cmc;

import com.google.gson.*;

import java.util.Date;

public class CMCStatic {

    public final static String SINGLE_COIN_EUR_URL = "https://api.coinmarketcap.com/v1/ticker/%s/?convert=EUR";

    public final static String FIRST_100_COIN_EUR_URL = "https://api.coinmarketcap.com/v1/ticker/?convert=EUR";

    public final static Gson GSON = new GsonBuilder()
            .registerTypeAdapter(Date.class, (JsonDeserializer<Date>) (json, typeOfT, context) -> new Date(json.getAsJsonPrimitive().getAsLong() * 1000))
            .registerTypeAdapter(Date.class, (JsonSerializer<Date>) (date, type, jsonSerializationContext) -> new JsonPrimitive(date.getTime() / 1000))
            .create();
}
