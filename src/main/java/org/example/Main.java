package org.example;

import org.example.model.entities.*;
import org.example.repository.InMemoryRepository;

import java.util.HashSet;
import java.util.Set;

public class Main {

    // Repositorios
    public static InMemoryRepository<ArticuloInsumo> articuloInsumoRepo = new InMemoryRepository<>();
    public static InMemoryRepository<ArticuloManufacturado> articuloManuRepo = new InMemoryRepository<>();
    public static InMemoryRepository<ArticuloManufacturadoDetalle> articuloManuDetalleRepo = new InMemoryRepository<>();
    public static InMemoryRepository<Categoria> categoriaRepo = new InMemoryRepository<>();
    public static InMemoryRepository<Imagen> imagenRepo = new InMemoryRepository<>();
    public static InMemoryRepository<UnidadMedida> unidadMedidaRepo = new InMemoryRepository<>();

    public static void main(String[] args) {

        // Creacion de las categorias
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

        // Creacion de las unidades de medida
        UnidadMedida kilogramos = UnidadMedida.builder()
                .denominacion("Kilogramos")
                .build();

        UnidadMedida litros = UnidadMedida.builder()
                .denominacion("Litros")
                .build();

        UnidadMedida gramos  = UnidadMedida.builder()
                .denominacion("Gramos")
                .build();

        unidadMedidaRepo.save(kilogramos);
        unidadMedidaRepo.save(litros);
        unidadMedidaRepo.save(gramos);

        // Creacion de Articulos Insumo con valores actualizados
        ArticuloInsumo sal = ArticuloInsumo.builder()
                .denominacion("Sal")
                .precioCompra(500)
                .precioVenta(1000)
                .stockActual(100)
                .stockMaximo(300)
                .esParaElaborar(true)
                .imagenes(new HashSet<>())
                .medida(kilogramos)
                .build();

        ArticuloInsumo aceite = ArticuloInsumo.builder()
                .denominacion("Aceite")
                .precioCompra(1500)
                .precioVenta(3000)
                .stockActual(80)
                .stockMaximo(200)
                .esParaElaborar(true)
                .imagenes(new HashSet<>())
                .medida(litros)
                .build();

        ArticuloInsumo carne = ArticuloInsumo.builder()
                .denominacion("Carne")
                .precioCompra(4000)
                .precioVenta(7500)
                .stockActual(50)
                .stockMaximo(100)
                .esParaElaborar(true)
                .imagenes(new HashSet<>())
                .medida(kilogramos)
                .build();

        ArticuloInsumo harina = ArticuloInsumo.builder()
                .denominacion("Harina")
                .precioCompra(300)
                .precioVenta(600)
                .stockActual(250)
                .stockMaximo(500)
                .esParaElaborar(true)
                .imagenes(new HashSet<>())
                .medida(kilogramos)
                .build();

        articuloInsumoRepo.save(sal);
        articuloInsumoRepo.save(aceite);
        articuloInsumoRepo.save(carne);

        // Creacion de las imagenes
        Imagen imagen1 = Imagen.builder()
                .denominacion("PizzaHawaiana1")
                .build();

        Imagen imagen2 = Imagen.builder()
                .denominacion("PizzaHawaiana2")
                .build();

        Imagen imagen3 = Imagen.builder()
                .denominacion("PizzaHawaiana1")
                .build();

        Imagen imagen4 = Imagen.builder()
                .denominacion("LomoCompleto1")
                .build();

        Imagen imagen5 = Imagen.builder()
                .denominacion("LomoCompleto2")
                .build();

        Imagen imagen6 = Imagen.builder()
                .denominacion("LomoCompleto3")
                .build();

        imagenRepo.save(imagen1);
        imagenRepo.save(imagen2);
        imagenRepo.save(imagen3);

        // Creacion de los articulos manufacturados detalle
        ArticuloManufacturadoDetalle detallePizzaHawaiana1 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(sal)
                .build();

        ArticuloManufacturadoDetalle detallePizzaHawaiana2 = ArticuloManufacturadoDetalle.builder()
                .cantidad(2)
                .insumo(harina)
                .build();

        ArticuloManufacturadoDetalle detallePizzaHawaiana3 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(aceite)
                .build();

        ArticuloManufacturadoDetalle detalleLomoCompleto1 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(sal)
                .build();

        ArticuloManufacturadoDetalle detalleLomoCompleto2 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(aceite)
                .build();

        ArticuloManufacturadoDetalle detalleLomoCompleto3 = ArticuloManufacturadoDetalle.builder()
                .cantidad(1)
                .insumo(carne)
                .build();

        articuloManuDetalleRepo.save(detallePizzaHawaiana1);
        articuloManuDetalleRepo.save(detallePizzaHawaiana2);
        articuloManuDetalleRepo.save(detallePizzaHawaiana3);
        articuloManuDetalleRepo.save(detalleLomoCompleto1);
        articuloManuDetalleRepo.save(detalleLomoCompleto2);
        articuloManuDetalleRepo.save(detalleLomoCompleto3);

        // Creacion de los articulos manufacturados
        ArticuloManufacturado pizzaHawaiana = ArticuloManufacturado.builder()
                .denominacion("Pizza Hawaiana")
                .precioVenta(3500)
                .imagenes(Set.of(imagen1, imagen2, imagen3))
                .descripcion("Pizza casera con jamón, ananá, queso mozzarella y salsa de tomate.")
                .tiempoEstimadoMinutos(25)
                .preparacion("Mezclar los ingredientes, estirar la masa, agregar los toppings y hornear por 20 minutos.")
                .detalles(Set.of(detallePizzaHawaiana1, detallePizzaHawaiana2, detallePizzaHawaiana3))
                .build();
        ArticuloManufacturado lomoCompleto = ArticuloManufacturado.builder()
                .denominacion("Lomo Completo")
                .precioVenta(5000)
                .imagenes(Set.of(imagen4, imagen5, imagen6))
                .descripcion("Lomo completo con lechuga, tomate, huevo, jamón, queso y mayonesa.")
                .tiempoEstimadoMinutos(30)
                .preparacion("Cocinar la carne, tostar el pan, agregar los ingredientes y servir.")
                .detalles(Set.of(detalleLomoCompleto1, detalleLomoCompleto2, detalleLomoCompleto3))
                .build();

        articuloManuRepo.save(pizzaHawaiana);
        articuloManuRepo.save(lomoCompleto);
    }
}
