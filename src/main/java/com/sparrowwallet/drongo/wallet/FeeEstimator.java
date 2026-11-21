package com.sparrowwallet.drongo.wallet;

import java.util.List;
import java.util.Map;

public interface FeeEstimator {
    long calcFee(Wallet wallet, Map<BlockTransactionHashIndex, WalletNode> utxos,
                 List<WalletTransaction.Output> outputs, double feeRate);
}
