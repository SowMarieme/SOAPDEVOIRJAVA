package com.mysoapapp.metier.service;

import java.util.List;
import com.mysoapapp.metier.dto.SectorDto;

public interface ISectorService {

	List<SectorDto> getAll();
	SectorDto get(int id);
	boolean delete(int id);

	// Retourne le DTO enregistré avec son id généré ou null en cas d’erreur
	SectorDto save(SectorDto sectorDto);

	// Retourne le DTO mis à jour ou null en cas d’erreur
	SectorDto update(SectorDto sectorDto);
}
