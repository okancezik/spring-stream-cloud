package com.okancezik.cashcardtransactionsource.domain.cashcard;

public record CashCard(
		Long id,
		String owner,
		Double amountRequestedForAuth
) { }
