package com.automotiva.estetica.rick.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrdemServicoAtualizadaEvent(
        LocalDateTime dataAgendamento,
        BigDecimal precoMinimo,
        String observacoes,
        Long status,
        Long motivo
) implements Serializable {}
