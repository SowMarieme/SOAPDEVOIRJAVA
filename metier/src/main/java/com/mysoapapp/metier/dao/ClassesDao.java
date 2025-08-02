package com.mysoapapp.metier.dao;

import com.mysoapapp.metier.entity.ClassesEntity;

public class ClassesDao extends RepositoryImpl<ClassesEntity> implements IClassesDao {

    public ClassesDao() {
        super(ClassesEntity.class);
    }

    // ici tu peux ajouter des méthodes spécifiques à Classes si besoin
}
