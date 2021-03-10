package com.example;

import javax.inject.Inject;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

@MicronautTest
class CacheableBugTest {
    @Inject
    CacheableBean bean;

    @Test
    void testItWorks() {
        assertThrows(
                IllegalArgumentException.class,
                () -> bean.cachedMethod().block()
        );
    }
}
