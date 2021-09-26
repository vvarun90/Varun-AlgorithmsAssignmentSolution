package com.greatlearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import com.greatlearning.*;

public class StocksManager {

    private int compCount = 0;
    private Company[] companies = null;

    public void collectStockData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of companies");
        compCount = sc.nextInt();
        companies = new Company[compCount];

        for (int i = 0; i < compCount; i++) {
            System.out.println("Enter current stock price of the company " + (i + 1));
            Company c = new Company();
            c.setStockPrice(sc.nextDouble());
            System.out.println("Whether company's stock price rose today compare to yesterday (true/false)?");
            String tempChange = sc.next();
            if (tempChange.equals("true")) {
                c.setSPStatus(true);
            } else if (tempChange.equals("false")) {
                c.setSPStatus(false);
            }
            companies[i] = c;
        }
    }

    public boolean searchStock(double val) {
        return Utils.stockSearch(companies, val);
    }

    public void sortStocks(boolean o) {
        companies = Utils.selectionSort(companies, o);
    }

    public int stockChangeCount(boolean index) {
        int ucount = 0;
        int dcount = 0;
        for (int i = 0; i < compCount; i++) {
            if (companies[i].isSPChanged() == true) {
                ucount++;
            } else {
                dcount++;
            }
        }
        if (index == true) {
            return ucount;
        }
        return dcount;
    }

    public void displayStocksData() {
        for (int i = 0; i < compCount; i++) {
            System.out.println(companies[i].getStockPrice() + " ");
        }
    }
}
