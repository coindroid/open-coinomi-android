package com.coinomi.core.coins;

import com.coinomi.core.coins.families.%COINOMI_COIN_FAMILY%Family;

/**
 * @author main@m42.cx
 */
public class %COIN_NAME_FIRST_CHAR_UPPERCASE%Main extends %COINOMI_COIN_FAMILY%Family {
    private %COIN_NAME_FIRST_CHAR_UPPERCASE%Main() {
        id = "%COIN_FULLNAME_LOWERCASE%.main"; // Do not change this id as wallets serialize this string



        addressHeader = %PUBKEY_ADDRESS%;
        p2shHeader = %SCRIPT_ADDRESS%;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = %WIF%;

        name = "%COIN_NAME%";
        symbol = "%TICKER%";
        uriScheme = "%COIN_FULLNAME_LOWERCASE%";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(%FEE%);
        minNonDust = value(1000); // 0.00001 DASH mininput
        softDustLimit = value(5000); // 0.001 DASH
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("%COIN_NAME_FIRST_CHAR_UPPERCASE% Signed Message:\n");

    }

    private static %COIN_NAME_FIRST_CHAR_UPPERCASE%Main instance = new %COIN_NAME_FIRST_CHAR_UPPERCASE%Main();
    public static synchronized CoinType get() {
        return instance;
    }
}
