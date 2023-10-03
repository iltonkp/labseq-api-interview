package com.interview.labseq.adpters.out;

import com.interview.labseq.domain.port.CacheControlPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Repository;

@Repository("caffeineCacheControl")
public class CaffeineCacheControl implements CacheControlPort {

    @Autowired
    private CacheManager cacheManager;

    private Cache getCafeiineCache() {
        return cacheManager.getCache("labseq_cache_manager");
    }

    @Override
    public Integer getDataByKey(Integer key) {
        return getCafeiineCache().get(key, Integer.class);
    }

    @Override
    public void addCacheData(Integer key, Integer data) {
        getCafeiineCache().put(key, data);
    }
}
