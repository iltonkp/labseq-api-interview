package com.interview.labseq.domain.usecases;

import com.interview.labseq.domain.port.CacheControlPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GenerateLabseqUseCase {

    @Autowired
    @Qualifier("inMemoryCacheControl")
    private CacheControlPort cacheControl;

    public Integer run(Integer n) {

        if (cacheControl.existKey(n)) return cacheControl.getDataByKey(n);

        Integer result = Math.abs(switch (n) {
            case 0, 2 -> 0;
            case 1, 3 -> 1;
            default -> run(n - 4) + run(n - 3);
        });

        cacheControl.addCacheData(n, result);

        return result;
    }

}
