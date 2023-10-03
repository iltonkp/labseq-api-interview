package com.interview.labseq.domain.port;

public interface CacheControlPort {
   String getDataByKey(int key);
   void addCacheData(int key, int data);

}
