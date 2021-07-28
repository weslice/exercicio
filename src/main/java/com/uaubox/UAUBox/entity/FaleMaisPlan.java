package com.uaubox.UAUBox.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "fale_mais_plan")
@NoArgsConstructor
@AllArgsConstructor
public class FaleMaisPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "origin")
    private Integer origin;

    @Column(name = "destination")
    private Integer destination;

    @Column(name = "tariff")
    private BigDecimal callPriceByMinute;

}
