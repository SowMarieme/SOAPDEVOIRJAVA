package com.mysoapapp.metier.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SectorDto implements Serializable {

	@XmlElement( required = true)
	private int id;
	@XmlElement(required = true)
	private String name;



	public SectorDto(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public SectorDto() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name =name;
	}

	
	
}
