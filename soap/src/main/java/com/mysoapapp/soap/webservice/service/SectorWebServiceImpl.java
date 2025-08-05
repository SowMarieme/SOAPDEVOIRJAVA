// SectorWebServiceImpl.java
package com.mysoapapp.soap.webservice.service;

import java.util.List;
import com.mysoapapp.metier.dto.SectorDto;
import com.mysoapapp.metier.service.ISectorService;
import com.mysoapapp.metier.service.SectorService;
import jakarta.jws.WebService;

@WebService(endpointInterface = "com.mysoapapp.soap.webservice.service.SectorWebService")
public class SectorWebServiceImpl implements SectorWebService {

	private final ISectorService sectorService = new SectorService();

	@Override
	public SectorDto get(int id) {
		return sectorService.get(id);
	}

	@Override
	public List<SectorDto> all() {
		return sectorService.getAll();
	}

	@Override
	public SectorDto save(SectorDto sectorDto) {
		return sectorService.save(sectorDto);
	}

	@Override
	public SectorDto update(SectorDto sectorDto) {
		return sectorService.update(sectorDto);
	}

	@Override
	public boolean delete(int id) {
		return sectorService.delete(id);
	}
}
