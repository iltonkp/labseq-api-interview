package com.interview.labseq.adpters.out;

import com.interview.labseq.domain.port.CacheControlPort;
import org.springframework.stereotype.Repository;

@Repository
public class RedisCacheControl implements CacheControlPort {
    @Override
    public String getDataByKey(int key) {
        return "test";
    }

    @Override
    public void addCacheData(int key, int data) {
        System.out.println("Chegou no cache");
    }
}
