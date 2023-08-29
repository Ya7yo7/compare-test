package com.gp.currencyexchange.service;

import com.gp.currencyexchange.dto.response.CompareDto;
import com.gp.currencyexchange.dto.response.ConversionDto;

import java.util.List;

public interface ExchangeService {

  //  CompareDto Compare(String base, String target1, String target2,String amount);

    ConversionDto convert(String base, String target, String amount);
    public List<CompareDto> Compare(String base, List<String> targetCurrencies, String amount);
}
