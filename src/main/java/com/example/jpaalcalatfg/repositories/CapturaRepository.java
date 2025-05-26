package com.example.jpaalcalatfg.repositories;

import com.example.jpaalcalatfg.entities.Captura;
import com.example.jpaalcalatfg.projections.CapturaInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CapturaRepository extends JpaRepository<Captura, Integer> {

    List<CapturaInfo> findAllBy();

    @Override
    void deleteById(Integer integer);

    @Query("select c from Captura c")
    List<CapturaInfo> buscarTodasCapturas();

    @Query("select c from Captura c where c.usuario.id = ?1")
    List<CapturaInfo> buscarPorIdUsu(Integer id);


}