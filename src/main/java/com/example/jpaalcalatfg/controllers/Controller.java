package com.example.jpaalcalatfg.controllers;

import com.example.jpaalcalatfg.models.ResponseModel;
import com.example.jpaalcalatfg.services.ServiceJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")
public class Controller {
    @Autowired
    private ServiceJPA serviceJPA;

    @GetMapping("/cebos")
    public ResponseEntity<ResponseModel> obtenerCebos(){
        return ResponseEntity.ok(serviceJPA.obtenerCebos());
    }

}
