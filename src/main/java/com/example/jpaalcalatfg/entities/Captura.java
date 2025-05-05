package com.example.jpaalcalatfg.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "capturas")
public class Captura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ColumnDefault("nextval('capturas_id_seq')")
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @Column(name = "especie", nullable = false, length = 100)
    private String especie;

    @Column(name = "peso", precision = 5, scale = 2)
    private BigDecimal peso;

    @Column(name = "tamano", precision = 5, scale = 2)
    private BigDecimal tamano;

    @Column(name = "ubicacion", length = 100)
    private String ubicacion;

    @Column(name = "fecha")
    private Instant fecha;

    @Column(name = "imagen_url", length = Integer.MAX_VALUE)
    private String imagenUrl;

    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "captura_id"),
            inverseJoinColumns = @JoinColumn(name = "cebo_id"))
    private Set<Cebo> cebos = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "capturas_equipamiento",
            joinColumns = @JoinColumn(name = "captura_id"),
            inverseJoinColumns = @JoinColumn(name = "equipamiento_id"))
    private Set<Equipamiento> equipamientos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "captura")
    private Set<Clima> climas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "captura")
    private Set<MetodosPesca> metodosPescas = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getTamano() {
        return tamano;
    }

    public void setTamano(BigDecimal tamano) {
        this.tamano = tamano;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public Set<Cebo> getCebos() {
        return cebos;
    }

    public void setCebos(Set<Cebo> cebos) {
        this.cebos = cebos;
    }

    public Set<Equipamiento> getEquipamientos() {
        return equipamientos;
    }

    public void setEquipamientos(Set<Equipamiento> equipamientos) {
        this.equipamientos = equipamientos;
    }

    public Set<Clima> getClimas() {
        return climas;
    }

    public void setClimas(Set<Clima> climas) {
        this.climas = climas;
    }

    public Set<MetodosPesca> getMetodosPescas() {
        return metodosPescas;
    }

    public void setMetodosPescas(Set<MetodosPesca> metodosPescas) {
        this.metodosPescas = metodosPescas;
    }

}