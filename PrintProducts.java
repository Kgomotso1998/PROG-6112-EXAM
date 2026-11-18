package com.mycompany.mattresssalesreport;

import java.text.DecimalFormat;

public class PrintProducts {
    
    private IProduct product;

    // Constructor to inject the IProduct dependency
    public PrintProducts(IProduct product) {
        this.product = product;
    }

    // Method to print total product sales
    public void printTotalProductSales() {
        System.out.println("I.   Total number of products sold: " + product.GetTotalProducts());
    }

    // Method to print average product sales
    public void printAverageProductSales() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("II.  Average products sold per product: " + df.format(product.GetAverageProductsSold()));
    }

    // Method to print the most popular product sales
    public void printMostPopularProductSales() {
        System.out.println("III. Most popular product: " + product.getMostPopularProduct());
    }

    //  print the complete full report layout
    public void printFullReport(String[] productNames, int[] unitsSold) {
        System.out.println("==========================================");
        System.out.println("       LOCAL MATTRESS SPECIALTY STORE     ");
        System.out.println("         MONTHLY SALES REPORT             ");
        System.out.println("==========================================");
        System.out.println("Top 3 Performing Products Breakdown:");
        for (int i = 0; i < productNames.length; i++) {
            System.out.println(" - " + productNames[i] + ": " + unitsSold[i] + " units sold");
        }
        System.out.println("------------------------------------------");
        
        // Calling the individual print methods
        printTotalProductSales();
        printAverageProductSales();
        printMostPopularProductSales();
        
        System.out.println("==========================================");
    }
}
