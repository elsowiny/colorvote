package com.elsowiny.colorvote.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elsowiny.colorvote.app.model.Color;
import com.elsowiny.colorvote.app.repository.ColorRepository;

@Service
public class ColorServiceImpl implements IColorService {

	@Autowired
	private ColorRepository repository;
	
	@Override
	public List<Color> findAll() {
		return (List<Color>) repository.findAll();
	}

	
}
