package com.example.demo.repos;

import com.example.demo.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Usuario findByNameAndEmail(String name, String email);
}
