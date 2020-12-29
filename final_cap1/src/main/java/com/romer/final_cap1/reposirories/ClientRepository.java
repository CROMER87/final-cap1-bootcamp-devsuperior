package com.romer.final_cap1.reposirories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romer.final_cap1.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}