package com.interview.labseq.domain.port;

public interface CacheControlPort {

    Integer getDataByKey(Integer key);

    void addCacheData(Integer key, Integer data);

}
