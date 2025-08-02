package com.mysoapapp.metier.service;

import java.util.List;

import com.mysoapapp.metier.dto.ClassesDto;

public interface IClassesService {
    List<ClassesDto> getAll();
    ClassesDto get(int id);
    boolean delete(int id);
    ClassesDto save(ClassesDto dto);
    ClassesDto update(ClassesDto dto);
}
