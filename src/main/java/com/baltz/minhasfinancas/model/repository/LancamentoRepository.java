package com.baltz.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baltz.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
