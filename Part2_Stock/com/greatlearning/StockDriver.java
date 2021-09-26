package com.greatlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import com.greatlearning.*;

public class StockDriver {

    public static void main(String[] args) {
        StocksManager sm = new StocksManager();
        sm.collectStockData();

        Scanner sc = new Scanner(System.in);
        int opt = -1;
        int upStox = 0;
        int downStox = 0;
        double tStk = 0;

        while (opt != 0) {
            opt = -1;
            System.out.println("------------------------------------");
            System.out.println("Enter the operation that you want to perform");
            System.out.println("1. Display the companies stock prices in ascending order");
            System.out.println("2. Display the companies stock prices in descending order");
            System.out.println("3. Display the total no of companies for which stock prices rose today");
            System.out.println("4. Display the total no of companies for which stock prices declined today");
            System.out.println("5. Search a specific stock price");
            System.out.println("6. press 0 to exit");
            System.out.println("------------------------------------");

            try {
                opt = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input...");
                opt = -1;
            }

            switch (opt) {
                case 1:
                    sm.sortStocks(true);
                    sm.displayStocksData();
                    break;
                case 2: 
                    sm.sortStocks(false);
                    sm.displayStocksData();
                    break;
                case 3:
                    upStox = sm.stockChangeCount(true);
                    System.out.println("Total no of companies whose stock price rose today: " + upStox);
                    break;
                case 4:
                    downStox = sm.stockChangeCount(false);
                    System.out.println("Total no of companies whose stock price declined today: " + downStox);
                    break;
                case 5:
                    System.out.println("enter the key value ");
                    tStk = sc.nextDouble();
                    if (sm.searchStock(tStk) == true) {
                        System.out.println("Stock of value " + tStk + " is present");
                    } else {
                        System.out.println("Value not found");
                    }
                    break;
                case 0:
                    break;
            }
        }
        sc.close();
    }
}
