package com.interview.labseq.adpters.out;

import com.interview.labseq.domain.port.CacheControlPort;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository("inMemoryCacheControl")
public class InMemoryCacheControl implements CacheControlPort {

    private final Map<Integer, Integer> memoryCache = new HashMap<Integer, Integer>();

    @Override
    public Boolean existKey(Integer key) {
        return memoryCache.containsKey(key);
    }

    @Override
    public Integer getDataByKey(Integer key) {
        return memoryCache.get(key);
    }

    @Override
    public void addCacheData(Integer key, Integer data) {

        memoryCache.put(key, data);

    }
}
