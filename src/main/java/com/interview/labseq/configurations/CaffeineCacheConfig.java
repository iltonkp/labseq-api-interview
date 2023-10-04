package com.interview.labseq.configurations;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
import java.util.List;

@Configuration
@EnableCaching
public class CaffeineCacheConfig {

    @Bean
    public CacheManager cacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        cacheManager.setCacheNames(List.of(CaffeineConstants.CACHE_NAME));
        cacheManager.setCaffeine(caffeineCacheBuilder());
        return cacheManager;
    }

    private Caffeine<Object, Object> caffeineCacheBuilder() {
        return Caffeine
                .newBuilder()
                .initialCapacity(CaffeineConstants.CACHE_INITIAL_CAPACITY)
                .maximumSize(CaffeineConstants.CACHE_MAXIMUM_SIZE)
                .expireAfterAccess(CaffeineConstants.CACHE_EXPIRE_AFTER)
                .recordStats();
    }
}
