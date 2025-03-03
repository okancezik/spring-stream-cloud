package com.okancezik.cashcardtransactionsource.domain.transaction;

import com.okancezik.cashcardtransactionsource.domain.cashcard.CashCard;

public record Transaction(
		Long id,
		CashCard cashCard
) {
}
