package com.mycompany.mattresssalesreport;

public class Product implements IProduct {
    
    private String[] productNames;
    private int[] unitsSold;

    public Product(String[] productNames, int[] unitsSold) {
        this.productNames = productNames;
        this.unitsSold = unitsSold;
    }

    @Override
    public int GetTotalProducts() {
        int totalUnitsSold = 0;
        for (int sales : unitsSold) {
            totalUnitsSold += sales;
        }
        return totalUnitsSold;
    }

    @Override
    public double GetAverageProductsSold() {
        if (productNames.length == 0) {
            return 0.0;
        }
        return (double) GetTotalProducts() / productNames.length;
    }

    @Override
    public String getMostPopularProduct() {
        if (unitsSold.length == 0) {
            return "No products available";
        }
        
        int maxSalesIndex = 0;
        for (int i = 1; i < unitsSold.length; i++) {
            if (unitsSold[i] > unitsSold[maxSalesIndex]) {
                maxSalesIndex = i;
            }
        }
        return productNames[maxSalesIndex] + " (" + unitsSold[maxSalesIndex] + " units)";
    }
}