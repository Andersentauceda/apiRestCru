package com.andersen.provaRestSouthSystem.repository;

import com.andersen.provaRestSouthSystem.model.Conta;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

@SuppressWarnings("unused")
@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {

    @Query(value = "select distinct conta from Conta conta",
            countQuery = "select count(distinct conta) from Conta conta")
    Page<Conta> findAllWithEagerRelationships(Pageable pageable);

    @Query(value = "select distinct conta from Conta conta")
    List<Conta> findAllWithEagerRelationships();

    @Query("select conta from Conta conta where conta.id =:id")
    Optional<Conta> findOneWithEagerRelationships(@Param("id") Long id);

}