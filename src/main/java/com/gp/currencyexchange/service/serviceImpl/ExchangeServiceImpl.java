package com.gp.currencyexchange.service.serviceImpl;

import com.gp.currencyexchange.dto.response.CompareDto;
import com.gp.currencyexchange.dto.response.ConversionDto;
import com.gp.currencyexchange.feignClient.Exchange;
import com.gp.currencyexchange.service.ExchangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class ExchangeServiceImpl implements ExchangeService {

    private final Exchange exchange;


    public ConversionDto convert(String base, String target, String amount) {
        ConversionDto pair =  exchange.getExchangeRate(base, target);
        pair.setConversion_rate((Double.parseDouble(pair.getConversion_rate()) * Double.parseDouble(amount)) + "");
        pair.setAmount(amount);
        return pair;
    }


    public CompareDto Compare(String base, String target1, String target2,String amount) {
        ConversionDto compare=convert(base,target1,amount);
        ConversionDto compare2=convert(base,target2,amount);
        return new CompareDto(base, target1, target2, compare.getConversion_rate(), compare2.getConversion_rate(),amount);
    }

}
