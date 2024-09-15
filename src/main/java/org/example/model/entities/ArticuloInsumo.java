package org.example.model.entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@SuperBuilder
@ToString
public class ArticuloInsumo extends Articulo {

    //
    private double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;

}
