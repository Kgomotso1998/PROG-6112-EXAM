package com.mycompany.mattresssalesreport;

import java.text.DecimalFormat;

public class MattressSalesReport {

    public static void main(String[] args) {
        // 3 performing mattress products over the month
        String[] productNames = {
            "CloudNine Memory Foam", 
            "Orthopedic Supreme Innerspring", 
            "Luxe Hybrid Latex"
        };
        
        int[] unitsSold = {145, 120, 160};

        // I.  Total Number of Products Sold
        int totalUnitsSold = 0;
        for (int sales : unitsSold) {
            totalUnitsSold += sales;
        }

        // II. Average Number of Products Sold Per Product
        double averageSold = (double) totalUnitsSold / productNames.length;

        // III. Most Popular Product (Highest Sales)
        int maxSalesIndex = 0;
        for (int i = 1; i < unitsSold.length; i++) {
            if (unitsSold[i] > unitsSold[maxSalesIndex]) {
                maxSalesIndex = i;
            }
        }
        String mostPopularProduct = productNames[maxSalesIndex];

        // Format the average to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");

        // Display the Monthly Sales Report
        System.out.println("========================");
        System.out.println("       LOCAL MATTRESS SPECIALTY STORE     ");
        System.out.println("         MONTHLY SALES REPORT             ");
        System.out.println("========================");
        System.out.println("Top 3 Performing Products Breakdown:");
        for (int i = 0; i < productNames.length; i++) {
            System.out.println(" - " + productNames[i] + ": " + unitsSold[i] + " units sold");
        }
        System.out.println("---------------------");
        System.out.println("I.   Total number of products sold: " + totalUnitsSold);
        System.out.println("II.  Average products sold per product: " + df.format(averageSold));
        System.out.println("III. Most popular product: " + mostPopularProduct + " (" + unitsSold[maxSalesIndex] + " units)");
        System.out.println("=====================");
    }
}