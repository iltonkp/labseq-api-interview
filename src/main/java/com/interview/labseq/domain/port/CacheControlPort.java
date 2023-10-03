package com.interview.labseq.domain.port;

public interface CacheControlPort {

   Boolean existKey(Integer key);
   Integer getDataByKey(Integer key);
   void addCacheData(Integer key, Integer data);

}
