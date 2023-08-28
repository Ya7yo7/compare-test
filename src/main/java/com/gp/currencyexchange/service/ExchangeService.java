package com.gp.currencyexchange.service;

import com.gp.currencyexchange.dto.response.CompareDto;
import com.gp.currencyexchange.dto.response.ConversionDto;

public interface ExchangeService {

    CompareDto Compare(String base, String target1, String target2,String amount);

    ConversionDto convert(String base, String target, String amount);

}
