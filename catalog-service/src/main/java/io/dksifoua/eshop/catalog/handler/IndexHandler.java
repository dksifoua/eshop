package io.dksifoua.eshop.catalog.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class IndexHandler {

    public Mono<ServerResponse> index() {
        String responseData = "Welcome to eshop product category service!";
        return ServerResponse.ok().body(Mono.just(responseData), String.class);
    }
}
