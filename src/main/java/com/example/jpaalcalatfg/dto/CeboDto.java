package com.example.jpaalcalatfg.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.example.jpaalcalatfg.entities.Cebo}
 */
public class CeboDto implements Serializable {
    private final Integer id;
    private final String tipoCebo;
    private final String descripcion;

    public CeboDto(Integer id, String tipoCebo, String descripcion) {
        this.id = id;
        this.tipoCebo = tipoCebo;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public String getTipoCebo() {
        return tipoCebo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CeboDto entity = (CeboDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.tipoCebo, entity.tipoCebo) &&
                Objects.equals(this.descripcion, entity.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipoCebo, descripcion);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "tipoCebo = " + tipoCebo + ", " +
                "descripcion = " + descripcion + ")";
    }
}