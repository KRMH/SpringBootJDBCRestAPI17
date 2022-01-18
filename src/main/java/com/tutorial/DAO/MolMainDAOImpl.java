package com.tutorial.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tutorial.model.MolMain;

@Repository
public class MolMainDAOImpl implements MolMainDAO{
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<MolMain> getAll() {
		return jdbcTemplate.query("Select * from MOL_MAIN_VO", new BeanPropertyRowMapper<MolMain>(MolMain.class));
	}
}
