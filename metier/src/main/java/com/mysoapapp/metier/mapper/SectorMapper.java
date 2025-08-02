package com.mysoapapp.metier.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.mysoapapp.metier.dto.SectorDto;
import com.mysoapapp.metier.entity.SectorEntity;

public class SectorMapper {

	
	public static List<SectorDto> listSectorEntityToListSectorDto(List<SectorEntity> sectors) {
		
		return sectors.stream()
				.map(SectorMapper::toSectorDto)
				.collect(Collectors.toList());
	}
	
	
	public static SectorDto toSectorDto(SectorEntity sector) {
		
		return new SectorDto(sector.getId(), sector.getName());
	}
	
	public static SectorEntity toSectorEntity(SectorDto sector) {
		
		return new SectorEntity(sector.getId(), sector.getName());
	}
}
