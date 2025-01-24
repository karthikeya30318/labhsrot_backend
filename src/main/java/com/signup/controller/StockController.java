package com.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.signup.model.Stock;
import com.signup.services.StockService;

@CrossOrigin
@RestController
@RequestMapping("/api/stocks")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@PostMapping("/save")
	public ResponseEntity<Stock> buyStock(@RequestBody Stock stock) {
        try {
            Stock savedStock = stockService.saveStock(stock);
            return ResponseEntity.ok(savedStock);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
	@GetMapping("/all")
	public ResponseEntity<Object> getAllStocks() {
	    List<Stock> stocks = stockService.getAllStocks();
	    System.out.println("Fetched stocks: " + stocks);
	    return ResponseEntity.ok(stocks);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteStock(@PathVariable Long id) {
	    try {
	        stockService.deleteStock(id);
	        return ResponseEntity.noContent().build();
	    } catch (Exception e) {
	        return ResponseEntity.notFound().build();
	    }
	}



}


