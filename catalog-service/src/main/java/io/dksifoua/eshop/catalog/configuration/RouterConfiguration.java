package io.dksifoua.eshop.catalog.configuration;

import io.dksifoua.eshop.catalog.handler.IndexHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfiguration {

    @Value("${app.base-path}")
    private String basePath;

    @Bean
    public RouterFunction<ServerResponse> handler(IndexHandler handler) {
        return RouterFunctions.route()
                .path(basePath, builder -> builder.GET(request -> handler.index()))
                .build();
    }
}
