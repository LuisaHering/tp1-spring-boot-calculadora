package com.infnet.calculadora_matematica.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperacaoRequest {
    private double numero1;
    private double numero2;
}