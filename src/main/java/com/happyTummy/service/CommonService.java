package com.happyTummy.service;

import java.util.List;
import java.util.Optional;
import com.happyTummy.model.Common;
import com.happyTummy.repository.CommonDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonService implements ICommonService {
	@Autowired
	CommonDAO commonDao; // Autowire an instance of CommonDAO to be used for dependency injection
	public CommonService() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public List<Common> findAll() {
		// TODO Auto-generated method stub
		return commonDao.getAll(); // Call getAll() method of CommonDAO to retrieve all Common objects
	}
	@Override
	public Optional<Common> getByDish(int _dishID) {
		// TODO Auto-generated method stub
		return commonDao.findbyId(_dishID); // Call findbyId() method of CommonDAO to retrieve a Common object by _dishID
	}

	

}
