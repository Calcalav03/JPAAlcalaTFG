package com.example.jpaalcalatfg.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.example.jpaalcalatfg.entities.Equipamiento}
 */
public class EquipamientoDto implements Serializable {
    private final Integer id;
    private final String tipoEquipo;
    private final String marca;
    private final String modelo;

    public EquipamientoDto(Integer id, String tipoEquipo, String marca, String modelo) {
        this.id = id;
        this.tipoEquipo = tipoEquipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipamientoDto entity = (EquipamientoDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tipoEquipo, entity.tipoEquipo) &&
                Objects.equals(this.marca, entity.marca) &&
                Objects.equals(this.modelo, entity.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoEquipo, marca, modelo);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tipoEquipo = " + tipoEquipo + ", " +
                "marca = " + marca + ", " +
                "modelo = " + modelo + ")";
    }
}