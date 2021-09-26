package com.greatlearning;

public class Company {
    private double stockPrice;
    private boolean spStatus;

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public boolean isSPChanged() {
        return spStatus;
    }

    public void setSPStatus(boolean sp_changed) {
        this.spStatus = sp_changed;
    }

    public String toString() {
        return "Stock Price: " + stockPrice + "Status " + spStatus;
    }

    public Company() {
    }
}
