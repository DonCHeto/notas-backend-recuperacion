package com.example.demo.dao;

import java.util.List;
import java.util.Optional;


import com.example.demo.entity.Curso;

public interface CursoDao {
	
	Curso create(Curso a);
	Curso update(Curso a);
	void delete(Long id);
	Optional<Curso> read(Long id);
	List<Curso> readAll();
}
