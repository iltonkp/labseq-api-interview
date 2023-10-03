package com.interview.labseq.adpters.in;

import com.interview.labseq.domain.usecases.GenerateLabseqUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labseq/{n}")
public class LabseqController {

    @Autowired
    private GenerateLabseqUseCase useCase;

    @GetMapping
    public long getLabseq(@PathVariable("n") int n){

        return useCase.run(n);
    }
}
