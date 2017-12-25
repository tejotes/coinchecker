package com.tejotes.coinchecker.coininfo.impl.cmc;

import com.tejotes.coinchecker.coininfo.api.CoinInfo;
import org.apache.deltaspike.core.api.projectstage.ProjectStage;
import org.apache.deltaspike.testcontrol.api.TestControl;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(CdiTestRunner.class)
@TestControl(projectStage = ProjectStage.IntegrationTest.class)
public class CoinInfoServiceCMCTest {

    @Inject
    CoinInfoServiceCMC cmcService;

    @Test
    public void info4coinId() throws Exception {
        // declare coinIds
        String[] coinIdArray = new String[]{"bitcoin", "ethereum", "iota", "dash"};

        // query each coin
        for (int i = 0; i < coinIdArray.length; i++) {
            String coinId = coinIdArray[i];
            CoinInfo coinInfo = cmcService.info4coinId(coinId);
            assertNotNull(coinInfo);
            System.out.println("CoinInfo=" + coinInfo);
        }
    }

    @Test
    public void info4coinIdFail() throws Exception {
        assertNotNull(cmcService);
        // query unknown coin
        CoinInfo coinInfo = cmcService.info4coinId("dm");
        assertNull(coinInfo);
    }
}
