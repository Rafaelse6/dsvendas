package com.rafaelsantos.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
