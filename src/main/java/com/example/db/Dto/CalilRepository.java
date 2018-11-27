package com.example.db.Dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalilRepository extends JpaRepository<Calil,Integer>{

}
