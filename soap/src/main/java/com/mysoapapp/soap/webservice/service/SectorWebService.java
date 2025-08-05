// SectorWebService.java
package com.mysoapapp.soap.webservice.service;

import java.util.List;

import com.mysoapapp.metier.dto.SectorDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface SectorWebService {

	@WebMethod
	SectorDto get(@WebParam(name = "id") int id);

	@WebMethod
	List<SectorDto> all();

	@WebMethod
	SectorDto save(@WebParam(name = "sectorDto") SectorDto sectorDto);

	@WebMethod
	SectorDto update(@WebParam(name = "sectorDto") SectorDto sectorDto);

	@WebMethod
	boolean delete(@WebParam(name = "id") int id);
}
