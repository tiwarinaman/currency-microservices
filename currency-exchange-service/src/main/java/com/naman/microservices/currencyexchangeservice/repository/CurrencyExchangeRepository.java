package com.naman.microservices.currencyexchangeservice.repository;

import com.naman.microservices.currencyexchangeservice.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository
        extends JpaRepository<CurrencyExchange, Long> {

    CurrencyExchange findCurrencyExchangeByFromAndTo(String from, String to);

}
