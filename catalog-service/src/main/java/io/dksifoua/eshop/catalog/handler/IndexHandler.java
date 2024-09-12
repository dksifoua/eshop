package io.dksifoua.eshop.catalog.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class IndexHandler {

    public Mono<ServerResponse> index() {
        return ServerResponse.ok().body(Mono.just("Welcome to eshop product category service!"), String.class);
    }
}
