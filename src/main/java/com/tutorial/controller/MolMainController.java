package com.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.DAO.MolMainDAO;
import com.tutorial.model.MolMain;

@RestController
public class MolMainController {
	
	@Autowired
	private MolMainDAO molMainDao;
	
	@GetMapping("/allOrderLines")
	public List<MolMain> getAllOrderLines(){
		return molMainDao.getAll();
		
	}
	
}
