package com.signup.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signup.model.Stock;
import com.signup.repository.StockRepository;

@Service
public class StockService {
	
	@Autowired
	private StockRepository stockRepository;
	
	
	public Stock saveStock(Stock stock) {
        return stockRepository.save(stock);
    }
	
	public Optional<Stock> getStockById(Long id) {
        return stockRepository.findById(id);
    }


    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }
    
    public void deleteStock(Long id) {
        stockRepository.deleteById(id);
    }


	}


