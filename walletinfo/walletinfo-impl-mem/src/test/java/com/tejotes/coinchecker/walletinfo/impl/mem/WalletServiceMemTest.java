package com.tejotes.coinchecker.walletinfo.impl.mem;

import com.tejotes.coinchecker.walletinfo.api.CoinQuantity;
import com.tejotes.coinchecker.walletinfo.api.Wallet;
import com.tejotes.coinchecker.walletinfo.api.WalletService;
import org.apache.deltaspike.core.api.projectstage.ProjectStage;
import org.apache.deltaspike.testcontrol.api.TestControl;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(CdiTestRunner.class)
@TestControl(projectStage = ProjectStage.IntegrationTest.class)
public class WalletServiceMemTest {

    @Inject
    private WalletService walletService;

    @Inject
    private Wallet.Builder walletBuilder;

    @Inject
    private CoinQuantity.Builder coinBuilder;

    @Test
    public void createWallet() {
        // create wallet
        Wallet wallet = walletBuilder.setName("TestWallet").setRefid("testwallet").build();
        String refid = walletService.createWallet(wallet);
        System.out.println("refid=" + refid);

        // add some coins
        CoinQuantity coins = coinBuilder.setCoinId("bitcoin").setQuantity(6.77756).build();
        wallet.addCoins(coins);
        coins = coinBuilder.setCoinId("monero").setQuantity(74.04).build();
        wallet.addCoins(coins);

        // list objects
        System.out.println("wallet=" + wallet);
        System.out.println("walletService=" + walletService);

    }

    @Test
    public void wallet4refid() {
        assertNotNull(walletService);
        System.out.println("walletService=" + walletService);

        createWallet();

        Wallet wallet = walletService.wallet4refid("testwallet");
        assertNotNull(wallet);
        System.out.println("walletService=" + walletService);

        assertEquals("TestWallet", wallet.name());
    }
}
