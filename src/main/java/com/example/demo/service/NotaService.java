package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.entity.Nota;

public interface NotaService {
	
	Nota create(Nota a);
	Nota update(Nota a);
	void delete(Long id);
	Optional<Nota> read(Long id);
	List<Nota> readAll();
}
