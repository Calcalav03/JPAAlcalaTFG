package com.example.jpaalcalatfg.repositories;

import com.example.jpaalcalatfg.entities.Equipamiento;
import com.example.jpaalcalatfg.projections.CeboInfo;
import com.example.jpaalcalatfg.projections.EquipamientoInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EquipamientoRepository extends JpaRepository<Equipamiento, Integer> {
    Optional<List<EquipamientoInfo>> findAllEquipamientoBy();
}