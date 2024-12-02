package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NotaDao;
import com.example.demo.entity.Nota;
import com.example.demo.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService {
	
	@Autowired
	private NotaDao dao;
	
	@Override
	public Nota create(Nota a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Nota update(Nota a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Nota> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Nota> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
