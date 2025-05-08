package com.example.jpaalcalatfg.services;

import com.example.jpaalcalatfg.dto.CapturaDto;
import com.example.jpaalcalatfg.dto.CeboDto;
import com.example.jpaalcalatfg.dto.EquipamientoDto;
import com.example.jpaalcalatfg.entities.*;
import com.example.jpaalcalatfg.mappers.CapturaMapper;
import com.example.jpaalcalatfg.mappers.CeboMapper;
import com.example.jpaalcalatfg.mappers.EquipamientoMapper;
import com.example.jpaalcalatfg.models.ResponseModel;
import com.example.jpaalcalatfg.projections.CeboInfo;
import com.example.jpaalcalatfg.projections.EquipamientoInfo;
import com.example.jpaalcalatfg.repositories.*;
import jakarta.transaction.Transactional;
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

    @Autowired
    private CapturaRepository   capturaRepository;
    @Autowired
    private ClimaRepository climaRepository;
    @Autowired
    private MetodosPescaRepository metodosPescaRepository;

    @Autowired
    private CapturaMapper capturaMapper;





    public ResponseModel crearCaptura(CapturaDto capturaDto){
        Captura captura = capturaMapper.toEntity(capturaDto);

        // Guardar la captura primero
        capturaRepository.save(captura);

        // Verificar si se ha creado correctamente
        if(captura.getId() == null){
            return new ResponseModel(1, "No se pudo crear la captura", null);
        }

        // Guardar climas asociados
        for (Clima clima : captura.getClimas()) {
            clima.setCaptura(captura);
            climaRepository.save(clima);
        }

        // Guardar métodos de pesca asociados
        for (MetodosPesca metodo : captura.getMetodosPescas()) {
            metodo.setCaptura(captura);
            metodosPescaRepository.save(metodo);
        }

        // Recargar la captura con climas y métodos de pesca
        captura = capturaRepository.findById(captura.getId()).orElse(null);

        return new ResponseModel(0, "Captura creada", captura);
    }


}
