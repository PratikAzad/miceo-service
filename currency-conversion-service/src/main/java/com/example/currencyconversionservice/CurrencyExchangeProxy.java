package com.example.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service", url = "${proxy.url}")
public interface CurrencyExchangeProxy {

    @GetMapping("/exchange/from/{from}/to/{to}")
    CurrencyConversionBean retrieveExchangeRate(@PathVariable("from")String from,
                                                @PathVariable("to")String to);
}
