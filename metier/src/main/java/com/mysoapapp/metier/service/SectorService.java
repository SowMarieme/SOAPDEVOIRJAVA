package com.mysoapapp.metier.service;

import java.util.List;

import com.mysoapapp.metier.dao.ISectorDao;
import com.mysoapapp.metier.dao.SectorDao;
import com.mysoapapp.metier.dto.SectorDto;
import com.mysoapapp.metier.entity.SectorEntity;
import com.mysoapapp.metier.mapper.SectorMapper;

public class SectorService implements ISectorService {

	private final ISectorDao sectorDao = new SectorDao();

	@Override
	public List<SectorDto> getAll() {
		return SectorMapper.listSectorEntityToListSectorDto(sectorDao.list(new SectorEntity()));
	}

	@Override
	public SectorDto get(int id) {
		return SectorMapper.toSectorDto(sectorDao.get(id, new SectorEntity()));
	}

	@Override
	public boolean delete(int id) {
		return sectorDao.delete(id);
	}

	@Override
	public SectorDto save(SectorDto sectorDto) {
		SectorEntity entity = SectorMapper.toSectorEntity(sectorDto);
		boolean success = sectorDao.save(entity);
		return success ? SectorMapper.toSectorDto(entity) : null;
	}

	@Override
	public SectorDto update(SectorDto sectorDto) {
		SectorEntity entity = SectorMapper.toSectorEntity(sectorDto);
		boolean success = sectorDao.update(entity);
		return success ? SectorMapper.toSectorDto(entity) : null;
	}
}
