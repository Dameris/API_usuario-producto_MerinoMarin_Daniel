package com.example.apipractica.dto;

import com.example.apipractica.modelo.Producto;
import com.example.apipractica.modelo.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class UserDTO {
    Long id;
    String name;
    String email;
    List<Long> products = new ArrayList<>();

    public UserDTO(Usuario usuario){
        id = usuario.getId();
        name = usuario.getName();
        email = usuario.getEmail();
        for (Producto producto:
                usuario.getProductos()){
            products.add(producto.getId());
        }
    }
}
