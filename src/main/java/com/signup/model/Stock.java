package com.signup.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
	private String symbol;
	private String companyName;
	private String industry;
    private double marketCap;
    private double dividendYield;
    private double peRatio;
    
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
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public double getMarketCap() {
		return marketCap;
	}
	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}
	public double getDividendYield() {
		return dividendYield;
	}
	public void setDividendYield(double dividendYield) {
		this.dividendYield = dividendYield;
	}
	public double getPeRatio() {
		return peRatio;
	}
	public void setPeRatio(double peRatio) {
		this.peRatio = peRatio;
	}


}
