package io.dksifoua.eshop.catalog.configuration;

import io.dksifoua.eshop.catalog.DefaultHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfiguration {

    @Bean
    public RouterFunction<ServerResponse> handler(DefaultHandler handler) {
        return RouterFunctions.route()
                .path("/default", builder -> builder.GET(request -> handler.handle()))
                .build();
    }
}
