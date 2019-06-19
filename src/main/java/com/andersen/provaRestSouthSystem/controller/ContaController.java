package com.andersen.provaRestSouthSystem.controller;

import com.andersen.provaRestSouthSystem.model.Conta;
import com.andersen.provaRestSouthSystem.repository.ContaRepository;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/contas"})
@NoArgsConstructor
public class ContaController {

    private ContaRepository repository;

    ContaController(ContaRepository contaRepository) {
        this.repository = contaRepository;
    }
   
    @GetMapping
    public Page<Conta> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    @GetMapping(path = {"/{id}"})
    public ResponseEntity findById(@PathVariable long id){
        return repository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Conta create(@RequestBody Conta conta){
        return repository.save(conta);
    }

    @PutMapping(value="/{id}")
    public ResponseEntity update(@PathVariable("id") long id,
                                 @RequestBody Conta conta) {
        return repository.findById(id)
                .map(record -> {
                    record.setNumero(conta.getNumero());
                    record.setAgencia(conta.getAgencia());
                    record.setCpf(conta.getCpf());
                    Conta updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(path ={"/{id}"})
    public ResponseEntity<?> delete(@PathVariable long id) {
        return repository.findById(id)
                .map(record -> {
                    record.setStatus(false);
                    Conta updated = repository.save(record);
                    return ResponseEntity.ok().body(updated);
                }).orElse(ResponseEntity.notFound().build());
    }
}
