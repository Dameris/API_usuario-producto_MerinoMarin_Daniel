package com.example.apipractica.dto;

import com.example.apipractica.modelo.Producto;
import com.example.apipractica.modelo.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
public class ProductDTO {
    Long id;
    String name;
    BigDecimal price;
    List<Long> users = new ArrayList<>();

    public ProductDTO(Producto producto){
        id = producto.getId();
        name = producto.getName();
        price = producto.getPrice();
        for (Usuario usuario:
                producto.getUsuarios()){
            users.add(producto.getId());
        }
    }
}
