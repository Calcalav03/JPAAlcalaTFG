package com.example.jpaalcalatfg.controllers;

import com.example.jpaalcalatfg.dto.CapturaDto;
import com.example.jpaalcalatfg.dto.CeboDto;
import com.example.jpaalcalatfg.dto.EquipamientoDto;
import com.example.jpaalcalatfg.models.ResponseModel;
import com.example.jpaalcalatfg.services.ServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/jpa")
public class Controller {
    @Autowired
    private ServiceJPA serviceJPA;

    @GetMapping("/cebos")
    public ResponseEntity<ResponseModel> obtenerCebos(){
        return ResponseEntity.ok(serviceJPA.obtenerCebos());
    }

    @PostMapping("/crearCebo")
    public ResponseEntity<ResponseModel> crearCebo(@RequestBody CeboDto ceboDto){
        return ResponseEntity.ok(serviceJPA.crearCebo(ceboDto));
    }

    @GetMapping("/equipamientos")
    public ResponseEntity<ResponseModel> obtenerEquipamientos(){
        return ResponseEntity.ok(serviceJPA.obtenerEquipamientos());
    }

    @PostMapping("/crearEquipamiento")
    public ResponseEntity<ResponseModel> crearEquipamiento(@RequestBody EquipamientoDto equipamientoDto){
        return ResponseEntity.ok(serviceJPA.crearEquipamiento(equipamientoDto));
    }



    @PostMapping("/crearCaptura")
    public ResponseEntity<ResponseModel> crearCaptura(@RequestBody CapturaDto capturaDto){
        return ResponseEntity.ok(serviceJPA.crearCaptura(capturaDto));
    }

    @GetMapping("/usuarioId/{nombre}")
    public ResponseEntity<ResponseModel> obtenerIdUsuario(@PathVariable String nombre){
        return ResponseEntity.ok(serviceJPA.obtenerIdPorNombre(nombre));
    }


    @GetMapping("/capturas")
    public ResponseEntity<ResponseModel> obtenerTodasCapturas(){
        return ResponseEntity.ok(serviceJPA.obtenerTodasCapturas());
    }



}
