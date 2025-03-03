package com.okancezik.cashcardtransactionenricher.service;

import com.okancezik.cashcardtransactionenricher.domain.ApprovalStatus;
import com.okancezik.cashcardtransactionenricher.domain.CardHolderData;
import com.okancezik.cashcardtransactionenricher.domain.EnrichedTransaction;
import com.okancezik.cashcardtransactionenricher.domain.Transaction;

import java.util.UUID;

public class EnrichmentService {
	public EnrichedTransaction enrichTransaction(Transaction transaction) {
		return new EnrichedTransaction(
				transaction.id(),
				transaction.cashCard(),
				ApprovalStatus.APPROVED,
				new CardHolderData(
						UUID.randomUUID(),
						transaction.cashCard().owner(),
						"123 Main street"
				)
		);
	}
}
