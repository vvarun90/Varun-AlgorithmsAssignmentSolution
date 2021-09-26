package com.greatlearning;

import com.greatlearning.*;

public class Utils {

    public static boolean stockSearch(Company[] comp, double stk) {

        if (comp == null) {
            return false;
        }
        int cmpCount = comp.length;
        for (int i = 0; i < cmpCount; i++) {
            if (comp[i].getStockPrice() == stk) {
                return true;
            }
        }
        return false;
    }

    public static Company[] selectionSort(Company[] comp, boolean order) {
        if (comp == null) {
            return null;
        }

        int len = comp.length;

        for (int i = 0; i < len - 1; i++) {
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (order == true) {
                    if (comp[j].getStockPrice() < comp[index].getStockPrice()) {
                        index = j;
                    }
                } else {
                    if (comp[j].getStockPrice() > comp[index].getStockPrice()) {
                        index = j;
                    }
                }
            }
            Company tComp = comp[index];
            comp[index] = comp[i];
            comp[i] = tComp;
        }

        return comp;
    }
}
