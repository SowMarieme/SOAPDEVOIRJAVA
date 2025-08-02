package com.mysoapapp.metier.dto;

public class ClassesDto {
    private Long id;
    private String className;
    private String description;
    private Long sectorId;  // juste l'id du secteur lié

    // getters et setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getSectorId() { return sectorId; }
    public void setSectorId(Long sectorId) { this.sectorId = sectorId; }
}
