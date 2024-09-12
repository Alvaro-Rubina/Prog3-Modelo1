package org.example.model.entities;

import lombok.*;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
@ToString(exclude = "articulos")
public class Categoria {

    //
    private Long id;
    private String denominacion;
    private Set<Articulo> articulos;
}
