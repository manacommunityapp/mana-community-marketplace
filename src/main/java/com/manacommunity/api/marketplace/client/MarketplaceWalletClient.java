package com.manacommunity.api.marketplace.client;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Microservice client bridge for wallet transactions and payouts.
 * In production, communicates via HTTP or Domain Events to mana-community-wallet / mana-community-finance.
 */
@Slf4j
@Component
public class MarketplaceWalletClient {

    public void creditWallet(
            Long userId,
            BigDecimal amount,
            String transactionType,
            String referenceType,
            Long referenceId,
            String description
    ) {
        log.info("[Wallet Client] Credited {} to user {} wallet [Type={}, Ref={}:{}, Desc='{}']",
                amount, userId, transactionType, referenceType, referenceId, description);
    }
}
