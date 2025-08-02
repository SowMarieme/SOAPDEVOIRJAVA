package com.mysoapapp.soap.webservice.service;

import java.util.List;
import com.mysoapapp.metier.dto.SectorDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface SectorWebService {

	@WebMethod(operationName = "getSector")
	SectorDto get(@WebParam(name = "idSector") int id);

	@WebMethod(operationName = "allSectors")
	List<SectorDto> all();

	@WebMethod(operationName = "saveSector")
	SectorDto save(@WebParam(name = "sector") SectorDto sectorDto);

	@WebMethod(operationName = "updateSector")
	SectorDto update(@WebParam(name = "sector") SectorDto sectorDto);

	@WebMethod(operationName = "deleteSector")
	boolean delete(@WebParam(name = "idSector") int id);
}
