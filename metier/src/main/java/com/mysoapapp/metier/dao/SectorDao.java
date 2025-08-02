package com.mysoapapp.metier.dao;

import com.mysoapapp.metier.entity.SectorEntity;

public class SectorDao extends RepositoryImpl<SectorEntity> implements ISectorDao {

	public SectorDao() {
		super(SectorEntity.class);
	}


}
