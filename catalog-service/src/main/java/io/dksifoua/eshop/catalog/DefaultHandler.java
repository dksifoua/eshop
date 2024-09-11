package io.dksifoua.eshop.catalog;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class DefaultHandler {

    public Mono<ServerResponse> handle() {
        return ServerResponse.ok().body(Mono.just("Hello world!!!"), String.class);
    }
}
