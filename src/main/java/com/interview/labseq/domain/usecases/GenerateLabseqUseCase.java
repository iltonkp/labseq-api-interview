package com.interview.labseq.domain.usecases;

import com.interview.labseq.domain.port.CacheControlPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenerateLabseqUseCase {

    @Autowired
    private CacheControlPort cacheControl;

    public int run(int n){
       return n;
    }
}
