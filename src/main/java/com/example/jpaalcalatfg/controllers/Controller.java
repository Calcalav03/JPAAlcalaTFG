package com.example.jpaalcalatfg.controllers;

import com.example.jpaalcalatfg.dto.CeboDto;
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

}
