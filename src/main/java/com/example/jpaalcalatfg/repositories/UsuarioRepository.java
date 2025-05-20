package com.example.jpaalcalatfg.repositories;

import com.example.jpaalcalatfg.entities.Usuario;
import com.example.jpaalcalatfg.projections.UsuarioInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    @Query("select u from Usuario u where u.nombre = ?1 or u.email = ?1")
    UsuarioInfo BuscarIdByNombre(String nombre);

}