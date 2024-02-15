package com.example.helpers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.entities.Presentacion;
import com.example.entities.Producto;
import com.example.services.PresentacionService;
import com.example.services.ProductoService;

@Configuration
public class LoadSampleData {

    @Bean
    public CommandLineRunner saveSampleData(ProductoService ProductoService, PresentacionService presentacionService) {

        return datos -> {
            presentacionService.save(Presentacion.builder()
            .name("unidad")
            .description("productos de a uno")
            .build());

            presentacionService.save(Presentacion.builder()
            .name("docena")
            .description("productos de a doce")
            .build());


            ProductoService.save(Producto.builder()
            .name("caramelo")
            .description("caramelo de fresa")
            .stock(149)
            .price(1.4)
            .presentacion(presentacionService.findById(1))
            .build());

            ProductoService.save(Producto.builder()
            .name("flores")
            .description("margaritas")
            .stock(156)
            .price(2.01)
            .presentacion(presentacionService.findById(2))
            .build());

            ProductoService.save(Producto.builder()
            .name("ramas de chocolate")
            .description("chocolate negro con leche")
            .stock(203)
            .price(13.02)
            .presentacion(presentacionService.findById(2))
            .build());

            ProductoService.save(Producto.builder()
            .name("romero")
            .description("ramas de romero")
            .stock(209)
            .price(2.30)
            .presentacion(presentacionService.findById(2))
            .build());

            ProductoService.save(Producto.builder()
            .name("casa de pajaros")
            .description("casa para palomas")
            .stock(364)
            .price(12.4)
            .presentacion(presentacionService.findById(1))
            .build());

            ProductoService.save(Producto.builder()
            .name("cuaderno de tela")
            .description("tamaño A5")
            .stock(756)
            .price(5.3)
            .presentacion(presentacionService.findById(1))
            .build());

            presentacionService.save(Presentacion.builder()
            .name("unidad")
            .description("productos de a uno")
            .build());

            presentacionService.save(Presentacion.builder()
            .name("docena")
            .description("productos de a doce")
            .build());


            ProductoService.save(Producto.builder()
            .name("cuaderno brillante")
            .description("cuaderno A4")
            .stock(465)
            .price(20.3)
            .presentacion(presentacionService.findById(2))
            .build());

            ProductoService.save(Producto.builder()
            .name("rulo de cabra")
            .description("queso de cabra")
            .stock(256)
            .price(12)
            .presentacion(presentacionService.findById(2))
            .build());

            ProductoService.save(Producto.builder()
            .name("pepsi")
            .description("bebida carbonatada")
            .stock(36)
            .price(3.5)
            .presentacion(presentacionService.findById(1))
            .build());

            ProductoService.save(Producto.builder()
            .name("isabel")
            .description("niña de juguete")
            .stock(283)
            .price(12)
            .presentacion(presentacionService.findById(2))
            .build());

            ProductoService.save(Producto.builder()
            .name("Andrea")
            .description("niña de trapo")
            .stock(234)
            .price(19)
            .presentacion(presentacionService.findById(1))
            .build());

        };
    }

}
