package com.happyTummy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.happyTummy.model.Common;
import com.happyTummy.service.ICommonService;
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api")
@RestController
public class CommonController {
	// Autowire an instance of ICommonService to be used for dependency injection
	@Autowired
	ICommonService commonService;
	
	// Handle HTTP GET request at /api/Common endpoint
	@GetMapping("/Common")
	List<Common> all()
	{
		return commonService.findAll();
	}
	
	// Handle HTTP GET request at /api/Common/{_dishID} endpoints
	@GetMapping("/Common/{_dishID}")
	Optional<Common> menuById(@PathVariable int _dishID)
	{
		return commonService.getByDish(_dishID);	
	}
	public CommonController() {
		// TODO Auto-generated constructor stub
	}
}
