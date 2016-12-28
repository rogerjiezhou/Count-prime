package com.prime.demo;

public class PrimeDemo {
	
	public int countPrime(int range) {
		
		int count = 0;
		boolean[] array = new boolean[range + 1];
		for(int i = 2; i <= range; i++) {
			if(i % 2 == 0)
				array[i] = false;
			else
				array[i] = true;
		}
		
		for(int i = 3; i < (int)Math.sqrt(range); i++) {
			if(array[i]) {
				for(int j = i + i ; j < range; j += i) {
					array[j] = false;
				}
			}
		}
		
		for(boolean temp : array) {
			if(temp == true)
				count++;
		}
				
		return count;
			
	}

}
