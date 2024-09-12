package org.example;

import org.example.model.entities.*;
import org.example.repository.InMemoryRepository;

import java.util.HashSet;

public class Main {

    // Repositorios
    public static InMemoryRepository<ArticuloInsumo> articuloInsumoRepo = new InMemoryRepository<>();
    public static InMemoryRepository<ArticuloManufacturado> articuloManuRepo = new InMemoryRepository<>();
    public static InMemoryRepository<ArticuloManufacturadoDetalle> articuloManuDetalleRepo = new InMemoryRepository<>();
    public static InMemoryRepository<Categoria> categoriaRepo = new InMemoryRepository<>();
    public static InMemoryRepository<Imagen> imagenRepo = new InMemoryRepository<>();
    public static InMemoryRepository<UnidadMedida> unidadMedidaRepo = new InMemoryRepository<>();

    public static void main(String[] args) {

        // Creacion de categoria Pizza
        Categoria pizzasCat = Categoria.builder()
                .denominacion("Pizzas")
                .articulos(new HashSet<>())
                .build();

        Categoria sandwichesCat = Categoria.builder()
                .denominacion("Sandwiches")
                .articulos(new HashSet<>())
                .build();

        Categoria lomosCat = Categoria.builder()
                .denominacion("Lomos")
                .articulos(new HashSet<>())
                .build();

        Categoria insumosCat = Categoria.builder()
                .denominacion("Insumos")
                .articulos(new HashSet<>())
                .build();

        categoriaRepo.save(pizzasCat);
        categoriaRepo.save(sandwichesCat);
        categoriaRepo.save(lomosCat);
        categoriaRepo.save(insumosCat);
        
    }
}