package com.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.signup.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Long>{

}
