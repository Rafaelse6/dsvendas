package com.rafaelsantos.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
