package com.elsowiny.colorvote.app.service;

import java.util.List;

import com.elsowiny.colorvote.app.model.Color;
import com.elsowiny.colorvote.app.model.Vote;

public interface IVoteService {

	List<Vote> findAll();

}
