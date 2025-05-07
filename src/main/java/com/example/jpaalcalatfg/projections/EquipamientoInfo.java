package com.example.jpaalcalatfg.projections;

/**
 * Projection for {@link com.example.jpaalcalatfg.entities.Equipamiento}
 */
public interface EquipamientoInfo {
    Integer getId();

    String getTipoEquipo();

    String getMarca();

    String getModelo();
}