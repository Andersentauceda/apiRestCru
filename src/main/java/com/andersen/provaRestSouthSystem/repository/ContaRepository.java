package com.andersen.provaRestSouthSystem.repository;

import com.andersen.provaRestSouthSystem.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {}