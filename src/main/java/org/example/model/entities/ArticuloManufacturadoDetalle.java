package org.example.model.entities;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString(exclude = "insumo")
public class ArticuloManufacturadoDetalle {

    //
    private Long id;
    private int cantidad;
    private ArticuloInsumo insumo;

}
