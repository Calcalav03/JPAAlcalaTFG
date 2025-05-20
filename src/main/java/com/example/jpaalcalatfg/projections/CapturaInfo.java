package com.example.jpaalcalatfg.projections;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Set;

/**
 * Projection for {@link com.example.jpaalcalatfg.entities.Captura}
 */
public interface CapturaInfo {
    Integer getId();

    String getEspecie();

    BigDecimal getPeso();

    BigDecimal getTamano();

    String getUbicacion();

    Instant getFecha();

    String getImagenUrl();

    UsuarioInfo getUsuario();

    Set<CeboInfo1> getCebos();

    Set<EquipamientoInfo1> getEquipamientos();

    Set<ClimaInfo> getClimas();

    Set<MetodosPescaInfo> getMetodosPescas();

    /**
     * Projection for {@link com.example.jpaalcalatfg.entities.Usuario}
     */
    interface UsuarioInfo {
        Integer getId();
    }

    /**
     * Projection for {@link com.example.jpaalcalatfg.entities.Cebo}
     */
    interface CeboInfo1 {
        Integer getId();
    }

    /**
     * Projection for {@link com.example.jpaalcalatfg.entities.Equipamiento}
     */
    interface EquipamientoInfo1 {
        Integer getId();
    }

    /**
     * Projection for {@link com.example.jpaalcalatfg.entities.Clima}
     */
    interface ClimaInfo {
        String getTemperatura();

        String getNubosidad();

        Boolean getLluvia();
    }

    /**
     * Projection for {@link com.example.jpaalcalatfg.entities.MetodosPesca}
     */
    interface MetodosPescaInfo {
        String getMetodo();
    }
}