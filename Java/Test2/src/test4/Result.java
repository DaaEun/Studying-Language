package test4;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int stockPairs(List<Integer> stocksProfit, long target) {
    	int size = stocksProfit.size();
    	Set<Integer> count = new HashSet<>();
    	for(int i=0; i<size; i++) {
    		for(int j=i+1; j<size; j++) {
    			if(target == stocksProfit.get(i) + stocksProfit.get(j)) {
    				
    				int num = (stocksProfit.get(i)<stocksProfit.get(j)?
    						stocksProfit.get(i):stocksProfit.get(j));
    		    	count.add(num);
    			}
    		}
    	}
    	return count.size();
    }

    public static void main(String[] args) {
    	
		int[] arr = {6, 6, 3, 9, 3, 5, 1};
    	List<Integer> stocksProfit = new ArrayList<Integer>();
    	for(int a : arr) {
    		stocksProfit.add(a);
    	}
    	long target = 12;
    	
    	System.out.println(stockPairs(stocksProfit, target));
	}
}

