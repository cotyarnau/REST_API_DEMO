package com.example.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.entities.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Integer>{
    Optional<Usuario> findByUserName(String userName);
    // es opcional nos protege del null pointer Exception. Es como una 
    // cajita donde podra venir el usuario o null. 
    boolean existsByUserName(String userName);
}
