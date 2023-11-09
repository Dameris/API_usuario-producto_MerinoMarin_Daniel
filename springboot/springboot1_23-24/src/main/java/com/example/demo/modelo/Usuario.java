package com.example.demo.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public final class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    private String email;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Producto> productos;
}
