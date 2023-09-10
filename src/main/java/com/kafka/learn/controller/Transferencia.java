package com.kafka.learn.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transferencia {

    private String id = UUID.randomUUID().toString();
    private Double valor;
    private String modalidade;
    private String contaOrigem;
    private String contaDestino;

    private Boolean autorizado = Boolean.FALSE;
}
