package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Alumno;

public interface AlumnoDao {
	
	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
