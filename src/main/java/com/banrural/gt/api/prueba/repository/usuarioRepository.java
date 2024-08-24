package com.banrural.gt.api.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banrural.gt.api.prueba.model.UsuarioModel;

@Repository
public interface usuarioRepository extends JpaRepository<UsuarioModel,Long>{

    UsuarioModel findByEmail(String email);

    UsuarioModel findByUsername(String username);

    UsuarioModel changePassword(String password);

    UsuarioModel changeUsername(String email);
    
}
