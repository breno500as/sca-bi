package com.puc.sca.bi.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.puc.sca.util.pojo.NivelAlerta;
import com.puc.sca.util.pojo.TipoSensor;

 

public class DadoSensorBarragem {

	@Id
	private String id;

	private String identificadorSensor;

	private NivelAlerta nivelAlerta;

	private TipoSensor tipoSensor;

	private LocalDateTime dataCriacaoDadoSensor;

	private LocalDateTime dataCriacaoRegistro = LocalDateTime.now();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdentificadorSensor() {
		return identificadorSensor;
	}

	public void setIdentificadorSensor(String identificadorSensor) {
		this.identificadorSensor = identificadorSensor;
	}

	public NivelAlerta getNivelAlerta() {
		return nivelAlerta;
	}

	public void setNivelAlerta(NivelAlerta nivelAlerta) {
		this.nivelAlerta = nivelAlerta;
	}

	public TipoSensor getTipoSensor() {
		return tipoSensor;
	}

	public void setTipoSensor(TipoSensor tipoSensor) {
		this.tipoSensor = tipoSensor;
	}

	public LocalDateTime getDataCriacaoDadoSensor() {
		return dataCriacaoDadoSensor;
	}

	public void setDataCriacaoDadoSensor(LocalDateTime dataCriacaoDadoSensor) {
		this.dataCriacaoDadoSensor = dataCriacaoDadoSensor;
	}

	public LocalDateTime getDataCriacaoRegistro() {
		return dataCriacaoRegistro;
	}

	public void setDataCriacaoRegistro(LocalDateTime dataCriacaoRegistro) {
		this.dataCriacaoRegistro = dataCriacaoRegistro;
	}

}
