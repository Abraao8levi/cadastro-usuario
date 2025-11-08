package com.javabraao.cadastro_usuario.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Usando Long em vez de Integer

    private String nome;
    private String email;
    private String senha;
}