package com.mysoapapp.metier.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "ClassesDto")  // Requis pour le marshalling SOAP
@XmlAccessorType(XmlAccessType.FIELD) // Rend les @XmlElement inutiles sur chaque champ
public class ClassesDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String className;
    private String description;
    private Long sectorId;

    public ClassesDto() {
        // Constructeur sans argument requis par JAXB
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getSectorId() { return sectorId; }
    public void setSectorId(Long sectorId) { this.sectorId = sectorId; }
}
