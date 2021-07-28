package com.uaubox.UAUBox.service;

import com.uaubox.UAUBox.dto.RequestDTO;
import com.uaubox.UAUBox.dto.ResponseDTO;
import com.uaubox.UAUBox.entity.FaleMaisPlan;
import com.uaubox.UAUBox.repository.FaleMaisPlanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;

@Service
@AllArgsConstructor
public class FaleMaisPlanService {

    private FaleMaisPlanRepository faleMaisPlanRepository;

    private FaleMaisPlan getByOriginAndDestination(Integer origin, Integer destination) {
        return faleMaisPlanRepository.findByOriginAndDestination(origin, destination);
    }

    public ResponseDTO calculateCallPrice(RequestDTO param) {
        var talkMore = getByOriginAndDestination(param.getOrigin(), param.getDestination());
        if (talkMore == null)
            return new ResponseDTO(Collections.EMPTY_LIST, null, "Não foi encontrado dados");

        float callPrice;
        var discountTime = param.getTime() - param.getPlan().getTariffDiscountTime();
        if (discountTime < 0)
            callPrice = 0;
        else
            callPrice = (talkMore.getCallPriceByMinute().floatValue() * discountTime);

        NumberFormat nf = new DecimalFormat(",##0,00");
        var formattedCurrency = nf.getCurrencyInstance().format(param.getPlan().getExtra() * callPrice);
        return new ResponseDTO(Collections.singletonMap("Call Price",
                formattedCurrency),
                null, "Registros Encontrados");
    }


}
