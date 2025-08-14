package com.rafael.transacao_api.controller;

import com.rafael.transacao_api.business.services.EstatisticasService;
import com.rafael.transacao_api.controller.dtos.EstatisticasResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatistica")
@RequiredArgsConstructor
public class EstatisticasController {
    private final EstatisticasService estatisticasService;

    public ResponseEntity<EstatisticasResponseDTO> buscarEstatisticas(
            @RequestParam(value = "intevalorBusca", required = false, defaultValue = "60") Integer intervaloBusca){
       return new ResponseEntity.ok(estatisticasService.calcularEstatisticasTransacoes(intervaloBusca));
    }

}
