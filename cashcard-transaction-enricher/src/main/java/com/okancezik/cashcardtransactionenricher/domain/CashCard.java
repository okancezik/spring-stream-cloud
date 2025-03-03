package com.okancezik.cashcardtransactionenricher.domain;

public record CashCard(
		Long id,
		String owner,
		Double amountRequestedForAuth) {
}
