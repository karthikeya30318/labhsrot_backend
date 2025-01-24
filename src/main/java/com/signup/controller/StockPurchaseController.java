package com.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.signup.model.StockPurchase;
import com.signup.services.StockPurchaseService;


@RestController
@RequestMapping("api/stocks")
@CrossOrigin
public class StockPurchaseController {
	
	@Autowired
	private StockPurchaseService stockPurchaseService;
	
	@PostMapping("/buy")
    public ResponseEntity<StockPurchase> buyStock(@RequestBody StockPurchase stockPurchase) {
        StockPurchase savedPurchase = stockPurchaseService.saveStockPurchase(stockPurchase);
        return ResponseEntity.ok(savedPurchase);
	

	}
	
	@GetMapping("/bought")
	public ResponseEntity<List<StockPurchase>> getBoughtStocks() {
	    List<StockPurchase> boughtStocks = stockPurchaseService.getAllBoughtStocks();
	    return ResponseEntity.ok(boughtStocks);
	}


}

