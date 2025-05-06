package com.example.jpaalcalatfg.services;

import com.example.jpaalcalatfg.dto.CeboDto;
import com.example.jpaalcalatfg.entities.Cebo;
import com.example.jpaalcalatfg.mappers.CeboMapper;
import com.example.jpaalcalatfg.models.ResponseModel;
import com.example.jpaalcalatfg.projections.CeboInfo;
import com.example.jpaalcalatfg.repositories.CeboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceJPA {
    @Autowired
    private CeboRepository ceboRepository;

    @Autowired
    private CeboMapper ceboMapper;

    public ResponseModel obtenerCebos(){
        Optional<List<CeboInfo>> listaCebosOptional = ceboRepository.findAllCeboBy();
        if(listaCebosOptional.isPresent()){
            return new ResponseModel(0,"Lista de cebos", listaCebosOptional.get());
        }
        return new ResponseModel(1,"No se pudo obtener cebos", null);
    }
    public ResponseModel crearCebo(CeboDto ceboDto){
        Cebo cebo = ceboMapper.toEntity(ceboDto);
        ceboRepository.save(cebo);
        if(cebo.getId() == null){
            return new ResponseModel(1,"No se pudo crear cebo", null);
        }
        return new ResponseModel(0,"Cebo creado", cebo);
    }
}
