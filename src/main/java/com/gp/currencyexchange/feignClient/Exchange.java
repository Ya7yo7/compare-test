package com.gp.currencyexchange.feignClient;


import com.gp.currencyexchange.dto.response.CompareDto;
import com.gp.currencyexchange.dto.response.ConversionDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "exchange", url = "https://v6.exchangerate-api.com/v6/${access_key}")
public interface Exchange {

    @GetMapping("/compare/{base}/{target1}/{target2}/{amount}")
    CompareDto compare(@PathVariable String base, @PathVariable String target1, @PathVariable String target2,@PathVariable String amount);



    @GetMapping("/pair/{base}/{target}")
    ConversionDto getExchangeRate(@PathVariable String base, @PathVariable String target);


}
