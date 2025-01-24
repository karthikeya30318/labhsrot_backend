package com.signup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signup.model.StockPurchase;
import com.signup.repository.StockPurchaseRepository;

@Service
public class StockPurchaseService {
	
	@Autowired
    private StockPurchaseRepository stockPurchaseRepository;
	
	
	 public StockPurchase saveStockPurchase(StockPurchase stockPurchase) {
	        stockPurchase.setPurchaseDate(java.time.LocalDateTime.now());
	        return stockPurchaseRepository.save(stockPurchase);
	    }
	 
	 public List<StockPurchase> getAllBoughtStocks() {
		    return stockPurchaseRepository.findAll(); // Adjust this method based on your repository implementation.
		}

	}



