package com.tejotes.coinchecker.walletinfo.impl.mem;

import com.tejotes.coinchecker.walletinfo.api.Wallet;

public class WalletMemBuilder implements Wallet.Builder {

    WalletMem wallet = new WalletMem();;

    @Override
    public Wallet build() {
        // store result
        Wallet result = wallet;

        // create new wallet
        wallet = new WalletMem();

        // return result
        return result;
    }

    @Override
    public Wallet.Builder setRefid(String refid) {
        wallet.setRefid(refid);
        return this;
    }

    @Override
    public Wallet.Builder setName(String name) {
        wallet.setName(name);
        return this;
    }
}
