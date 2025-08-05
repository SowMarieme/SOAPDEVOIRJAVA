package com.mysoapapp.soap.webservice.service;

import java.util.List;
import com.mysoapapp.metier.dto.ClassesDto;
import com.mysoapapp.metier.dto.SectorDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
@WebService
public interface ClassesWebService {

    @WebMethod(operationName = "getClasseById")
    ClassesDto getClasseById(@WebParam(name = "id") int id);


    @WebMethod(operationName = "allClasses")
    List<ClassesDto> all();

    @WebMethod(operationName = "saveClass")
    ClassesDto save(@WebParam(name = "classeDto") ClassesDto dto);

    @WebMethod(operationName = "deleteClass")
    boolean delete(@WebParam(name = "id") int id);

    @WebMethod(operationName = "updateClass")
    ClassesDto update(@WebParam(name = "classeDto") ClassesDto dto);
}

