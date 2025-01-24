package com.signup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signup.model.StockPurchase;

@Repository
public interface StockPurchaseRepository extends JpaRepository<StockPurchase, Long>  {

}
