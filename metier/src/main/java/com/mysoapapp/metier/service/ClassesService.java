package com.mysoapapp.metier.service;

import java.util.List;

import com.mysoapapp.metier.dao.ClassesDao;
import com.mysoapapp.metier.dao.IClassesDao;
import com.mysoapapp.metier.dto.ClassesDto;
import com.mysoapapp.metier.entity.ClassesEntity;
import com.mysoapapp.metier.mapper.ClassesMapper;

public class ClassesService implements IClassesService {

    private final IClassesDao classesDao = new ClassesDao();

    @Override
    public List<ClassesDto> getAll() {
        return ClassesMapper.listClassesEntityToListClassesDto(classesDao.list(new ClassesEntity()));
    }

    @Override
    public ClassesDto get(int id) {
        return ClassesMapper.toClassesDto(classesDao.get(id, new ClassesEntity()));
    }

    @Override
    public boolean delete(int id) {
        return classesDao.delete(id);
    }

    @Override
    public ClassesDto save(ClassesDto dto) {
        ClassesEntity entity = ClassesMapper.toClassesEntity(dto);
        boolean result = classesDao.save(entity);
        if (result) {
            dto.setId(entity.getId()); // mettre à jour l'id après insertion
            return dto;
        }
        return null;
    }

    @Override
    public ClassesDto update(ClassesDto dto) {
        ClassesEntity entity = ClassesMapper.toClassesEntity(dto);
        boolean result = classesDao.update(entity);
        if (result) {
            return dto;
        }
        return null;
    }
}
