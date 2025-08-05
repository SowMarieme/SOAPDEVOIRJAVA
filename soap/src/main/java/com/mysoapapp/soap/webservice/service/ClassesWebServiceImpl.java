package com.mysoapapp.soap.webservice.service;

import java.util.List;

import com.mysoapapp.metier.dto.ClassesDto;
import com.mysoapapp.metier.dto.SectorDto;
import com.mysoapapp.metier.service.ClassesService;
import com.mysoapapp.metier.service.IClassesService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(endpointInterface = "com.mysoapapp.soap.webservice.service.ClassesWebService")
public class ClassesWebServiceImpl implements ClassesWebService {

    private final IClassesService classesService = new ClassesService();

    @Override
    public ClassesDto getClasseById(int id) {
        return classesService.get(id);
    }


    @Override
    @WebMethod(operationName = "allClasses")
    public List<ClassesDto> all() {
        return classesService.getAll();

    }


    @Override
    @WebMethod(operationName = "saveClass")
    public ClassesDto save(@WebParam(name = "classeDto") ClassesDto dto) {
        return classesService.save(dto);
    }


    @Override
    @WebMethod(operationName = "deleteClass")
    public boolean delete(@WebParam(name = "id") int id) {
        return classesService.delete(id);
    }

    @Override
    @WebMethod(operationName = "updateClass")
    public ClassesDto update(@WebParam(name = "classeDto") ClassesDto dto) {
        return classesService.update(dto);
    }
}
