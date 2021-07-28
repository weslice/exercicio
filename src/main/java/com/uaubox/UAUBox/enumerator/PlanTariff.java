package com.uaubox.UAUBox.enumerator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlanTariff {
    TARIFA_FIXA("Tarifa Fixa", 0, 0),
    FALE_MAIS_30("Plano Fale Mais 30", 30, 1.1),
    FALE_MAIS_60("Plano Fale Mais 60", 60, 1.1),
    FALE_MAIS_120("Plano Fale Mais 120", 120, 1.1);

    private String name;
    private Integer tariffDiscountTime;
    private double extra;

}
