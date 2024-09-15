package org.example.model.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@SuperBuilder
@ToString(exclude = "detalles")
public class ArticuloManufacturado extends Articulo {

    //
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();
}
