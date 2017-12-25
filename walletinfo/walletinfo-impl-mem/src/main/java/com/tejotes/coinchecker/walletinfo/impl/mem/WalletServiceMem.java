package com.tejotes.coinchecker.walletinfo.impl.mem;

import com.tejotes.coinchecker.walletinfo.api.CoinQuantity;
import com.tejotes.coinchecker.walletinfo.api.Wallet;
import com.tejotes.coinchecker.walletinfo.api.WalletService;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class WalletServiceMem implements WalletService {

    final private Map<String, Wallet> walletMap = new ConcurrentHashMap();

    @Override
    public String createWallet(Wallet wallet) {
        // check params
        if (wallet == null) {
            throw new IllegalArgumentException("wallet == null");
        }

        // check refid
        String refid = wallet.refid();
        if (refid == null) {
            refid = UUID.randomUUID().toString();
        }
        if (walletMap.containsKey(refid)) {
            throw new IllegalStateException("wallet already exists: " + refid);
        }

        // store wallet
        walletMap.put(refid, wallet);

        // return refid
        return refid;
    }

    @Override
    public Wallet wallet4refid(String refid) {
        return walletMap.get(refid);
    }

    @Override
    public String toString() {
        return "WalletServiceMem{" +
                "walletMap=" + walletMap +
                '}';
    }
}
