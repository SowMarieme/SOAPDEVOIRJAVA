package com.mysoapapp.soap.webservice.service;

import java.util.List;
import com.mysoapapp.metier.dto.ClassesDto;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public interface ClassesWebService {
    @WebMethod(operationName = "getClass")
    ClassesDto get(@WebParam(name = "idClass") int id);

    @WebMethod(operationName = "allClasses")
    List<ClassesDto> all();

    @WebMethod(operationName = "saveClass")
    ClassesDto save(@WebParam(name = "class") ClassesDto dto);

    @WebMethod(operationName = "deleteClass")
    boolean delete(@WebParam(name = "idClass") int id);

    @WebMethod(operationName = "updateClass")
    ClassesDto update(@WebParam(name = "class") ClassesDto dto);
}
