package com.example.jpaalcalatfg.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;

/**
 * DTO for {@link com.example.jpaalcalatfg.entities.Captura}
 */
public class CapturaDto implements Serializable {
    private final Integer id;
    private final UsuarioDto usuario;
    private final String especie;
    private final BigDecimal peso;
    private final BigDecimal tamano;
    private final String ubicacion;
    private final Instant fecha;
    private final String imagenUrl;
    private final Set<CeboDto1> cebos;
    private final Set<EquipamientoDto1> equipamientos;
    private final Set<ClimaDto> climas;
    private final Set<MetodosPescaDto> metodosPescas;

    public CapturaDto(Integer id, UsuarioDto usuario, String especie, BigDecimal peso, BigDecimal tamano, String ubicacion, Instant fecha, String imagenUrl, Set<CeboDto1> cebos, Set<EquipamientoDto1> equipamientos, Set<ClimaDto> climas, Set<MetodosPescaDto> metodosPescas) {
        this.id = id;
        this.usuario = usuario;
        this.especie = especie;
        this.peso = peso;
        this.tamano = tamano;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.imagenUrl = imagenUrl;
        this.cebos = cebos;
        this.equipamientos = equipamientos;
        this.climas = climas;
        this.metodosPescas = metodosPescas;
    }

    public Integer getId() {
        return id;
    }

    public UsuarioDto getUsuario() {
        return usuario;
    }

    public String getEspecie() {
        return especie;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public BigDecimal getTamano() {
        return tamano;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Instant getFecha() {
        return fecha;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public Set<CeboDto1> getCebos() {
        return cebos;
    }

    public Set<EquipamientoDto1> getEquipamientos() {
        return equipamientos;
    }

    public Set<ClimaDto> getClimas() {
        return climas;
    }

    public Set<MetodosPescaDto> getMetodosPescas() {
        return metodosPescas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CapturaDto entity = (CapturaDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.usuario, entity.usuario) &&
                Objects.equals(this.especie, entity.especie) &&
                Objects.equals(this.peso, entity.peso) &&
                Objects.equals(this.tamano, entity.tamano) &&
                Objects.equals(this.ubicacion, entity.ubicacion) &&
                Objects.equals(this.fecha, entity.fecha) &&
                Objects.equals(this.imagenUrl, entity.imagenUrl) &&
                Objects.equals(this.cebos, entity.cebos) &&
                Objects.equals(this.equipamientos, entity.equipamientos) &&
                Objects.equals(this.climas, entity.climas) &&
                Objects.equals(this.metodosPescas, entity.metodosPescas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, especie, peso, tamano, ubicacion, fecha, imagenUrl, cebos, equipamientos, climas, metodosPescas);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "usuario = " + usuario + ", " +
                "especie = " + especie + ", " +
                "peso = " + peso + ", " +
                "tamano = " + tamano + ", " +
                "ubicacion = " + ubicacion + ", " +
                "fecha = " + fecha + ", " +
                "imagenUrl = " + imagenUrl + ", " +
                "cebos = " + cebos + ", " +
                "equipamientos = " + equipamientos + ", " +
                "climas = " + climas + ", " +
                "metodosPescas = " + metodosPescas + ")";
    }

    /**
     * DTO for {@link com.example.jpaalcalatfg.entities.Usuario}
     */
    public static class UsuarioDto implements Serializable {
        private final Integer id;

        public UsuarioDto(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UsuarioDto entity = (UsuarioDto) o;
            return Objects.equals(this.id, entity.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ")";
        }
    }

    /**
     * DTO for {@link com.example.jpaalcalatfg.entities.Cebo}
     */
    public static class CeboDto1 implements Serializable {
        private final Integer id;

        public CeboDto1(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CeboDto1 entity = (CeboDto1) o;
            return Objects.equals(this.id, entity.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ")";
        }
    }

    /**
     * DTO for {@link com.example.jpaalcalatfg.entities.Equipamiento}
     */
    public static class EquipamientoDto1 implements Serializable {
        private final Integer id;

        public EquipamientoDto1(Integer id) {
            this.id = id;
        }

        public Integer getId() {
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            EquipamientoDto1 entity = (EquipamientoDto1) o;
            return Objects.equals(this.id, entity.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "id = " + id + ")";
        }
    }

    /**
     * DTO for {@link com.example.jpaalcalatfg.entities.Clima}
     */
    public static class ClimaDto implements Serializable {
        private final Integer id;
        private final String temperatura;
        private final String nubosidad;
        private final Boolean lluvia;

        public ClimaDto(Integer id ,String temperatura, String nubosidad, Boolean lluvia) {
            this.id = id;
            this.temperatura = temperatura;
            this.nubosidad = nubosidad;
            this.lluvia = lluvia;
        }
        public Integer getId() {
            return id;
        }

        public String getTemperatura() {
            return temperatura;
        }

        public String getNubosidad() {
            return nubosidad;
        }

        public Boolean getLluvia() {
            return lluvia;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ClimaDto entity = (ClimaDto) o;
            return Objects.equals(this.temperatura, entity.temperatura) &&
                    Objects.equals(this.nubosidad, entity.nubosidad) &&
                    Objects.equals(this.lluvia, entity.lluvia);
        }

        @Override
        public int hashCode() {
            return Objects.hash(temperatura, nubosidad, lluvia);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "temperatura = " + temperatura + ", " +
                    "nubosidad = " + nubosidad + ", " +
                    "lluvia = " + lluvia + ")";
        }
    }

    /**
     * DTO for {@link com.example.jpaalcalatfg.entities.MetodosPesca}
     */
    public static class MetodosPescaDto implements Serializable {
        private final Integer id;
        private final String metodo;

        public MetodosPescaDto(Integer id,String metodo) {
            this.id = id;
            this.metodo = metodo;
        }
        public Integer getId() {return id;}
        public String getMetodo() {
            return metodo;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MetodosPescaDto entity = (MetodosPescaDto) o;
            return Objects.equals(this.metodo, entity.metodo);
        }

        @Override
        public int hashCode() {
            return Objects.hash(metodo);
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "(" +
                    "metodo = " + metodo + ")";
        }
    }
}