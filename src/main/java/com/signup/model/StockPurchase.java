package com.signup.model;

import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
public class StockPurchase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	private String symbol;
    private String companyName;
    private int stockCount;
    private String orderType;
    private String marketType;
    private String exchangeType;
    private String stopLoss;
    private boolean gtt;
    private String tradingType;
    private LocalDateTime purchaseDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getMarketType() {
		return marketType;
	}
	public void setMarketType(String marketType) {
		this.marketType = marketType;
	}
	public String getExchangeType() {
		return exchangeType;
	}
	public void setExchangeType(String exchangeType) {
		this.exchangeType = exchangeType;
	}
	public String getStopLoss() {
		return stopLoss;
	}
	public void setStopLoss(String stopLoss) {
		this.stopLoss = stopLoss;
	}
	public boolean isGtt() {
		return gtt;
	}
	public void setGtt(boolean gtt) {
		this.gtt = gtt;
	}
	public String getTradingType() {
		return tradingType;
	}
	public void setTradingType(String tradingType) {
		this.tradingType = tradingType;
	}
	public LocalDateTime getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDateTime purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
    
    
	
	

}
