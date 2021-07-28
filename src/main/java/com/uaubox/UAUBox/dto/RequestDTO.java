package com.uaubox.UAUBox.dto;

import com.uaubox.UAUBox.enumerator.PlanTariff;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class RequestDTO {

    private int origin;
    private int destination;
    private int time;
    @Enumerated(EnumType.STRING)
    private PlanTariff plan;


}
