package com.example;

import javax.inject.Singleton;

import io.micronaut.cache.annotation.Cacheable;
import reactor.core.publisher.Mono;

@Singleton
public class CacheableBean {
    @Cacheable(cacheNames = "my-cache")
    public Mono<String> cachedMethod() {
        return Mono.error(new IllegalArgumentException("err"));
    }
}
