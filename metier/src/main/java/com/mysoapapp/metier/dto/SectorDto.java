package com.mysoapapp.metier.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@XmlRootElement(name = "sector")
@XmlAccessorType(XmlAccessType.FIELD)
public class SectorDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(required = true)
	private int id;

	@XmlElement(required = true)
	private String name;

	public SectorDto() {
		// Constructeur sans arguments requis par JAXB
	}

	public SectorDto(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() { return id; }

	public void setId(int id) { this.id = id; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
}
