package com.interview.labseq.adpters.in;

import com.interview.labseq.domain.usecases.GenerateLabseqUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labseq/{n}")
@CrossOrigin(origins = "*")
public class LabseqController {

    @Autowired
    private GenerateLabseqUseCase useCase;

    @GetMapping
    public ResponseEntity<Integer> getLabseq(@PathVariable Integer n){

        return ResponseEntity.ok(useCase.run(n));
    }
}
