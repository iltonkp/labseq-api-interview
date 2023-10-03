package com.interview.labseq.adpters.out;

import com.interview.labseq.domain.port.CacheControlPort;
import org.springframework.stereotype.Repository;

@Repository("redisCacheControl")
public class RedisCacheControl implements CacheControlPort {
    @Override
    public Boolean existKey(Integer key) {
        return Boolean.FALSE;
    }

    @Override
    public Integer getDataByKey(Integer key) {
        return 50;
    }

    @Override
    public void addCacheData(Integer key, Integer data) {

    }
}
