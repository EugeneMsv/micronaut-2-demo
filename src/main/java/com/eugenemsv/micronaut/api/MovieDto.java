package com.eugenemsv.micronaut.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Accessors(chain = true)
@ToString
public class MovieDto {

    private String uid;

    private String name;

    private LocalDate releaseDate;

    private BigDecimal rate;

}
