package com.example.jpaalcalatfg.repositories;

import com.example.jpaalcalatfg.entities.Clima;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClimaRepository extends JpaRepository<Clima, Integer> {
}