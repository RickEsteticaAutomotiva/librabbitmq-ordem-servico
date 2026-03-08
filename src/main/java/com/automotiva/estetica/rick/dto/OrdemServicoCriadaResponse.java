package com.automotiva.estetica.rick.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public record OrdemServicoCriadaResponse(
        Long IdOrdemServico,
        String placaVeiculo,
        LocalDateTime dataAgendamento,
        List<String> servicos,
        String observacoes)
        implements Serializable {}
