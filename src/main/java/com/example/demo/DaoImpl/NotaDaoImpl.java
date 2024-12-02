package com.example.demo.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.NotaDao;
import com.example.demo.entity.Nota;
import com.example.demo.repository.NotaRepository;

@Component
public class NotaDaoImpl implements NotaDao {
	
	@Autowired
	private NotaRepository repository;
	
	@Override
	public Nota create(Nota a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Nota update(Nota a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Nota> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Nota> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
