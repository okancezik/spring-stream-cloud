package com.okancezik.cashcardtransactionsource.stream;

import com.okancezik.cashcardtransactionsource.domain.transaction.Transaction;
import com.okancezik.cashcardtransactionsource.service.DataSourceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class CashCardTransactionStream {
	@Bean
	public Supplier<Transaction> approvalRequest(DataSourceService dataSourceService) {
		return dataSourceService::getData;
	}

	@Bean
	public DataSourceService dataSourceService() {
		return new DataSourceService();
	}
}
