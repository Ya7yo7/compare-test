package com.gp.currencyexchange.controller;

import com.gp.currencyexchange.dto.response.*;
import com.gp.currencyexchange.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class currencyExchangeCont {

    private final ExchangeService exchange;



    @GetMapping("/pair/{base}/{target}/{amount}")
    public ConversionDto getExchangeRate(@PathVariable String base, @PathVariable String target, @PathVariable String amount) {
        return exchange.convert(base, target, amount);
    }

   // @GetMapping("/compare/{base}/{target1}/{target2}/{amount}")
    //CompareDto compare(@PathVariable String base, @PathVariable String target1, @PathVariable String target2,@PathVariable String amount) {
      //  return exchange.Compare(base, target1, target2,amount);
    //}

    @GetMapping("/compare")
    public List<CompareDto> compareCurrencies(
            @RequestParam String base,
            @RequestParam List<String> targetCurrencies,
            @RequestParam String amount) {

        // Call the Compare function with the provided parameters
        List<CompareDto> comparisons = compareCurrencies(base, targetCurrencies, amount);

        return comparisons;
    }
}
