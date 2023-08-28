package com.gp.currencyexchange;
import com.gp.currencyexchange.dto.response.CompareDto;
import com.gp.currencyexchange.dto.response.ConversionDto;
import com.gp.currencyexchange.service.ExchangeService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CurrencyExchangeApplicationTests{

    public class ComparerTest {
        @Mock
        private ExchangeService service1;
        private CompareDto comparer;
        @Test
        public void testCompare() {
            String base = "USD";
            String target1 = "EUR";
            String target2 = "GBP";
            String amount = "100";

            ConversionDto conversionDto1 = new ConversionDto();
            conversionDto1.setConversion_rate("0.85");

            ConversionDto conversionDto2 = new ConversionDto();
            conversionDto2.setConversion_rate("0.75");

            when(service1.convert(base, target1, amount)).thenReturn(conversionDto1);
            when(service1.convert(base, target2, amount)).thenReturn(conversionDto2);

            CompareDto result = service1.Compare(base, target1, target2, amount);

            assertEquals(base, result.getBase());
            assertEquals(target1, result.getFirstTarget());
            assertEquals(target2, result.getSecondTarget());
            assertEquals("0.85", result.getConversionRate1());
            assertEquals("0.75", result.getConversionRate2());
            assertEquals(amount, result.getAmount());
        }
    }

}




