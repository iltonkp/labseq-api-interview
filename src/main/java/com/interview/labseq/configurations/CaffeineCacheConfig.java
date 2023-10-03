package com.interview.labseq.configurations;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
@EnableCaching
public class CaffeineCacheConfig {

    private static final String CACHE_NAME = "labseq_cache_manager";
    private static final Integer CACHE_INITIAL_CAPACITY = 200;
    private static final Integer CACHE_MAXIMUM_SIZE = 10000;
    private static final Duration CACHE_EXPIRE_AFTER = Duration.ofMinutes(120);


    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        cacheManager.setCaffeine(caffeineCacheBuilder());
        return cacheManager;
    }

    private Caffeine<Object, Object> caffeineCacheBuilder() {
        return Caffeine
                .newBuilder()
                .initialCapacity(CACHE_INITIAL_CAPACITY)
                .maximumSize(CACHE_MAXIMUM_SIZE)
                .expireAfterAccess(CACHE_EXPIRE_AFTER)
                .recordStats();
    }
}
