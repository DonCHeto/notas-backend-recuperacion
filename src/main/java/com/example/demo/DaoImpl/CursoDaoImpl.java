package com.example.demo.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CursoDao;
import com.example.demo.entity.Curso;
import com.example.demo.repository.CursoRepository;

@Component
public class CursoDaoImpl implements CursoDao {
	
	@Autowired
	private CursoRepository repository;
	
	@Override
	public Curso create(Curso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Curso update(Curso a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Curso> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Curso> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
