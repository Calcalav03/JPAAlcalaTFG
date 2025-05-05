package com.example.jpaalcalatfg.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "cebos")
public class Cebo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('cebos_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "tipo_cebo", nullable = false, length = 100)
    private String tipoCebo;

    @Column(name = "descripcion", length = Integer.MAX_VALUE)
    private String descripcion;

    @ManyToMany(mappedBy = "cebos")
    private Set<Captura> capturas = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoCebo() {
        return tipoCebo;
    }

    public void setTipoCebo(String tipoCebo) {
        this.tipoCebo = tipoCebo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Captura> getCapturas() {
        return capturas;
    }

    public void setCapturas(Set<Captura> capturas) {
        this.capturas = capturas;
    }

}