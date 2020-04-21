package com.hendisantika.springbootrestapipostgresql.controller;

import com.hendisantika.springbootrestapipostgresql.entity.Comuna;
import com.hendisantika.springbootrestapipostgresql.repository.ComunaRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/Tienda")
@Validated //required for @Valid on method parameters such as @RequesParam, @PathVariable, @RequestHeader
public class ComunaRestController {

    @Autowired
    private ComunaRepository repository;

    @PostMapping
    public ResponseEntity<?> addComunaTienda(@RequestBody Comuna comuna) {
        return new ResponseEntity<>(repository.save(comuna), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Collection<Comuna>> getAllTienda(  @ApiParam("The size of the page to be returned") @RequestParam(required = false) Integer pageSize,
                                                             @ApiParam("Zero-based page index") @RequestParam(required = false) Integer pageNo,
                                                             @ApiParam("Zero-based page sort") @RequestParam(required = false) String sortBy) {
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comuna> getComunaTiendaWithId(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id), HttpStatus.OK);
    }

/*    @GetMapping(params = {"name"})
    public ResponseEntity<Collection<Comuna>> findComunaTiendaWithName(@RequestParam(value = "local_nombre") String local_nombre) {
        return new ResponseEntity<>(repository.findByName(local_nombre), HttpStatus.OK);
    }*/


    @DeleteMapping("/{id}")
    public void deleteComunaTiendaWithId(@PathVariable Long id) {
        repository.delete(id);
    }

    @DeleteMapping
    public void deleteAllComunaTienda() {
        repository.deleteAll();
    }
}