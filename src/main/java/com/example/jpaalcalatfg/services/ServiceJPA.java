package com.example.jpaalcalatfg.services;

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

    public ResponseModel obtenerCebos(){
        Optional<List<CeboInfo>> listaCebosOptional = ceboRepository.findAllCeboBy();
        if(listaCebosOptional.isPresent()){
            return new ResponseModel(0,"Lista de cebos", listaCebosOptional.get());
        }
        return new ResponseModel(1,"No se pudo obtener cebos", null);
    }
}
