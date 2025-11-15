package com.leet_code;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestNumber {

    public String kthLargestNumber(String[] nums, int k) {
    	PriorityQueue<String> pq = new PriorityQueue<>(Comparator.<String>comparingInt(Integer::parseInt).reversed());
//    	Comparator<String> cmp = (Comparator<String>) Comparator.comparingInt(Integer::parseInt).reversed();
//    	PriorityQueue<String> pq = new PriorityQueue<>(cmp);

    	//Create number as string comparator
    	//Insert nums to a priority queue
    	for (String n : nums)
    		pq.add(n);
    	//get the index k + 1
    	
    	for (int i = 0; i < k; i++) {
    		if (i == k - 1) {
    			return pq.poll();
    		}
    		pq.poll();
    	}
    	
    	return "";//should never get here
    }
}
