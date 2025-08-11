package com.infnet.calculadora_matematica.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperacaoResponse {
    private String operacao;      // "adição", "subtração", etc.
    private double numero1;       // O primeiro número que veio
    private double numero2;       // O segundo número que veio
    private double resultado;     // O resultado da operação
    private String metodo;        // "GET" ou "POST"

    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();
}
