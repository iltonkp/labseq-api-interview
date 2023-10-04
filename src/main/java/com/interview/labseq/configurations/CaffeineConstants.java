package com.interview.labseq.configurations;

import java.time.Duration;

public class CaffeineConstants {

    public static final String CACHE_NAME = "labseq_cache_manager";
    public static final Integer CACHE_INITIAL_CAPACITY = 200;
    public static final Integer CACHE_MAXIMUM_SIZE = 10000;
    public static final Duration CACHE_EXPIRE_AFTER = Duration.ofMinutes(120);
}
