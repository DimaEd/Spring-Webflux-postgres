package com.ednach.springwebfluxpostgres.config;

import com.ednach.springwebfluxpostgres.handler.ProductHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
class ProductsEndpointConfig {

    private static final String PRODUCT = "/product";

    @Bean
    RouterFunction<ServerResponse> routes(ProductHandler handler) {
        return route(GET(PRODUCT), handler::all)
                .andRoute(POST(PRODUCT), handler::create)
                .andRoute(DELETE(PRODUCT + "/{id}"), handler::deleteById);
    }
}
