package com.puc.sca.bi.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.puc.sca.bi.model.DadoSensorBarragem;
import com.puc.sca.bi.repository.DadoSensorBarragemRepository;

/**
 * Controller integrado a sensores IOT instalados na barragem informando os
 * níveis de alerta.
 * 
 * @author breno
 *
 */
@RestController
@RequestMapping("dados-monitoramento")
public class DadoMonitoramentoBarragemController {

	@Autowired
	private DadoSensorBarragemRepository dadoSensorBarragemRepository;

	@PostMapping
	public void incluiDadoMonitoramento(@RequestBody DadoSensorBarragem dadoSensorBarragem) {
		dadoSensorBarragem.setDataCriacaoRegistro(LocalDateTime.now());
		this.dadoSensorBarragemRepository.save(dadoSensorBarragem);
	}

	@GetMapping
	public Iterable<DadoSensorBarragem> getDadosMonitoramento(
			@RequestParam("page") Integer page,
			@RequestParam("size") Integer size, 
			@RequestParam(name = "sort", defaultValue = "id") String sort) {
		Pageable pageable = PageRequest.of(page - 1, size, Sort.by(sort));
		return this.dadoSensorBarragemRepository.findAll(pageable);
	}

}
