package com.okancezik.cashcardtransactionenricher.enricher;

import com.okancezik.cashcardtransactionenricher.domain.EnrichedTransaction;
import com.okancezik.cashcardtransactionenricher.domain.Transaction;
import com.okancezik.cashcardtransactionenricher.service.EnrichmentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class CashCardTransactionEnricher {
	@Bean
	EnrichmentService enrichmentService() {
		return new EnrichmentService();
	}

	@Bean
	public Function<Transaction, EnrichedTransaction> enrichTransaction(EnrichmentService enrichmentService) {
		return enrichmentService::enrichTransaction;
	}
}
