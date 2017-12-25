package com.tejotes.coinchecker.walletinfo.api;

public interface WalletService {

    String createWallet(Wallet wallet);

    Wallet wallet4refid(String refid);
}
