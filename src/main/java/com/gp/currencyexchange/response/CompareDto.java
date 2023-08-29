package com.gp.currencyexchange.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CompareDto {
    private String base;
    private List<String> targetCurrencies;
    private List<String> ConversionRate;
   // private String firstTarget;
    //private String secondTarget;
    //private String ConversionRate1;
    //private String ConversionRate2;
    private String amount;

    public CompareDto(String base, String target, String conversionRate, String amount) {
        // Initialize the CompareDto object with the provided parameters
    }




}
