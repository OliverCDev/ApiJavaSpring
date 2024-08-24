package com.banrural.gt.api.prueba.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    
    @ManyToMany
    @JoinTable(
        name="usuario_proyecto",
        joinColumns = @JoinColumn(name="usuario_id"),
        inverseJoinColumns = @JoinColumn(name="proyecto_id")
    )
    private Set<ProyectoModel> proyectos;
}
