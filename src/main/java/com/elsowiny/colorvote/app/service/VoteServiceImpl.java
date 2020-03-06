package com.elsowiny.colorvote.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.elsowiny.colorvote.app.model.Color;
import com.elsowiny.colorvote.app.model.Vote;
import com.elsowiny.colorvote.app.repository.ColorRepository;
import com.elsowiny.colorvote.app.repository.VoteRepository;

@Service
public class VoteServiceImpl implements IVoteService {

	@Autowired
	private VoteRepository repository;
	
	@Override
	public List<Vote> findAll() {
		return (List<Vote>) repository.findAll();
	}


}
