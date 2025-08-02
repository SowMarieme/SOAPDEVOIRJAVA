package com.mysoapapp.metier.mapper;

import com.mysoapapp.metier.dto.ClassesDto;
import com.mysoapapp.metier.entity.ClassesEntity;
import com.mysoapapp.metier.entity.SectorEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ClassesMapper {

    public static ClassesDto toClassesDto(ClassesEntity entity) {
        if (entity == null) return null;
        ClassesDto dto = new ClassesDto();
        dto.setId(entity.getId());
        dto.setClassName(entity.getClassName());
        dto.setDescription(entity.getDescription());
        if (entity.getSector() != null) {
            dto.setSectorId((long) entity.getSector().getId());
        }
        return dto;
    }

    public static ClassesEntity toClassesEntity(ClassesDto dto) {
        if (dto == null) return null;
        ClassesEntity entity = new ClassesEntity();
        entity.setId(dto.getId());
        entity.setClassName(dto.getClassName());
        entity.setDescription(dto.getDescription());
        if (dto.getSectorId() != null) {
            SectorEntity sector = new SectorEntity();
            sector.setId(Math.toIntExact(dto.getSectorId()));
            entity.setSector(sector);
        }
        return entity;
    }

    public static List<ClassesDto> listClassesEntityToListClassesDto(List<ClassesEntity> entities) {
        return entities.stream()
                .map(ClassesMapper::toClassesDto)
                .collect(Collectors.toList());
    }
}
