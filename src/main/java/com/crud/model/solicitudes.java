package com.crud.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "solicitud")
public class solicitudes {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_solicitud;
	
	@JsonProperty("nombres_solicitud")
    @NotBlank
    private String nombres;
	
	@JsonProperty("apellidos_solicitud")
    @NotBlank
    private String apellidos;
	
	@JsonProperty("lugar_de_destino_solicitud")
    @NotBlank
    private String destino;
	
	
	@JsonProperty("fecha_solicitud")

    private Date fecha_solicitud;


	public solicitud() {
		
	}



	public Long getId_solicitud() {
		return id_solicitud;
	}



	public void setId_solicitud(Long id_solicitud) {
		this.id_solicitud = id_solicitud;
	}


	
	public String getNombres() {
		return nombres;
	}
    
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}



	public String getApellidos() {
		return apellidos;
	}


	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDestino() {
		return destino;
	}


	
	public void setDestino(String destino) {
		this.destino = destino;
	}



	public Date getFecha_solicitud() {
		return fecha_solicitud;
	}

public void setFecha_solicitud(Date fecha_solicitud) {
		this.fecha_solicitud = fecha_solicitud;
	}


	
	
	
	
	
	
	
	

}
