package com.example.jpaalcalatfg.repositories;

import com.example.jpaalcalatfg.entities.Cebo;
import com.example.jpaalcalatfg.projections.CeboInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CeboRepository extends JpaRepository<Cebo, Integer> {
   Optional<List<CeboInfo>> findAllCeboBy();

}