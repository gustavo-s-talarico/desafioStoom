package br.com.desafio.rest;

import br.com.desafio.model.Adress;
import br.com.desafio.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AdressResource {

    @Autowired
    private AdressService service;

    @GetMapping("/api/adress")
    public List<Adress> getAllAdress() {

       return service.findAll();

    }

    @GetMapping("/api/adress/{id}")
    public ResponseEntity<Adress> getAdress(@PathVariable("id") Long id) {
        final Adress adress = service.findById(id);

        return ResponseEntity.ok(adress);
    }

    @PostMapping("/api/adress")
    @ResponseStatus(HttpStatus.CREATED)
    public Adress createAdress(@Valid @RequestBody Adress adress){

        return service.save(adress);
    }
    
    @PutMapping("/api/adress/{id}")
    public ResponseEntity<Adress> updateAdress(@PathVariable("id") Long id, @Valid @RequestBody Adress dtoAdress) {

        final Adress adress = service.update(id, dtoAdress);

        return ResponseEntity.ok(adress);

    }

    @DeleteMapping("/api/adress/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        service.delete(id);
    }
}
