package com.happyTummy.service;

import java.util.List;
import java.util.Optional;

import com.happyTummy.model.Common;

public interface ICommonService {
	List<Common> findAll();
	Optional<Common> getByDish(int _dishID);
}
