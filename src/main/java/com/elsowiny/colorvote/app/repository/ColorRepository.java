package com.elsowiny.colorvote.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elsowiny.colorvote.app.model.Color;

public interface ColorRepository extends JpaRepository<Color, Integer> {

}
