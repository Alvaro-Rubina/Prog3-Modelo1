package org.example.model.entities;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString(exclude = "detalles")
public class ArticuloManufacturado extends Articulo {

    //
    private String descripcion;
    private int tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();
}
