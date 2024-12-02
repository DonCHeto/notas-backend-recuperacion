package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Nota;
import com.example.demo.service.NotaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/notas")
@CrossOrigin
public class NotaController {
	
	@Autowired
	private NotaService notaService;
	
	@GetMapping
	public ResponseEntity<List<Nota>> readAll(){
		try {
			List<Nota> Notas = notaService.readAll();
			if(Notas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Notas, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Nota> create(@Valid @RequestBody Nota cat){
		try {
			Nota c = notaService.create(cat);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Nota> getMarcabyId(@PathVariable("id") Long id){
		try {
			Nota c = notaService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Nota> delMarca(@PathVariable("id") Long id){
		try {
			notaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateMarca(@PathVariable("id") Long id, @Valid @RequestBody Nota cat){

	    Optional<Nota> existingNota = notaService.read(id);
	    
	    if(existingNota.isPresent()) {

	    	Nota updatedNota= existingNota.get();
	        

	    	updatedNota.setNota1(cat.getNota1());
	    	updatedNota.setNota2(cat.getNota2());
	    	updatedNota.setNota3(cat.getNota3());
	    	updatedNota.setPromedio(cat.getPromedio());


	        notaService.update(updatedNota);
	        return new ResponseEntity<>(updatedNota, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
}
