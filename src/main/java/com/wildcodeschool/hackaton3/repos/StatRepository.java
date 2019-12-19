package com.wildcodeschool.hackaton3.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wildcodeschool.hackaton3.entities.Stats;


public interface StatRepository extends JpaRepository<Stats, Long> {

}
