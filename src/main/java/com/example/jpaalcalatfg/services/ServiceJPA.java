package com.example.jpaalcalatfg.services;

import com.example.jpaalcalatfg.dto.CeboDto;
import com.example.jpaalcalatfg.dto.EquipamientoDto;
import com.example.jpaalcalatfg.entities.Cebo;
import com.example.jpaalcalatfg.entities.Equipamiento;
import com.example.jpaalcalatfg.mappers.CeboMapper;
import com.example.jpaalcalatfg.mappers.EquipamientoMapper;
import com.example.jpaalcalatfg.models.ResponseModel;
import com.example.jpaalcalatfg.projections.CeboInfo;
import com.example.jpaalcalatfg.projections.EquipamientoInfo;
import com.example.jpaalcalatfg.repositories.CeboRepository;
import com.example.jpaalcalatfg.repositories.EquipamientoRepository;
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

    @Autowired
    private EquipamientoRepository equipamientoRepository;

    @Autowired
    private EquipamientoMapper equipamientoMapper;

    public ResponseModel obtenerEquipamientos(){
        Optional<List<EquipamientoInfo>> listaEquipamientoOptional = equipamientoRepository.findAllEquipamientoBy();
        if(listaEquipamientoOptional.isPresent()){
            return new ResponseModel(0,"Lista de equipamientos", listaEquipamientoOptional.get());
        }
        return new ResponseModel(1,"No se pudo obtener los equipamientos", null);
    }

    public ResponseModel crearEquipamiento(EquipamientoDto equipamientoDto){
        Equipamiento equipamiento = equipamientoMapper.toEntity(equipamientoDto);
        equipamientoRepository.save(equipamiento);
        if(equipamiento.getId() == null){
            return new ResponseModel(1,"No se pudo crear el Equipamiento", null);
        }
        return new ResponseModel(0,"Equipamiento creado", equipamiento);
    }
}
