package com.gp.currencyexchange.feignClient;


import com.gp.currencyexchange.dto.response.CompareDto;
import com.gp.currencyexchange.dto.response.ConversionDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "exchange", url = "https://v6.exchangerate-api.com/v6/${access_key}")
public interface Exchange {

    @GetMapping("/compare")
    CompareDto Compare(@RequestParam String base,
    @RequestParam
    List<String> targetCurrencies,
    @RequestParam String amount);



    @GetMapping("/pair/{base}/{target}")
    ConversionDto getExchangeRate(@PathVariable String base, @PathVariable String target);


}
