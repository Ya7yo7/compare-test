package com.gp.currencyexchange.dto.response;


import com.gp.currencyexchange.service.ExchangeService;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
public class ConversionDto {
    private String base_code;
    private String target_code;
    private String amount;
    private String conversion_rate;

}
