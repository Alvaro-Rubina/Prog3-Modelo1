package org.example.model.entities;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString(exclude = {"imagenes", "medida"})
public abstract class Articulo {

    //
    protected Long id;
    protected String denominacion;
    protected double precioVenta;
    protected Set<Imagen> imagenes = new HashSet<>();
    protected UnidadMedida medida;

}
