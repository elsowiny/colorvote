package com.elsowiny.colorvote.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.elsowiny.colorvote.app.model.Color;
import com.elsowiny.colorvote.app.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
	
}
