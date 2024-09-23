package com.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Service {

	public static void main(String[] args) throws IOException {
	
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String n = bufferedReader.readLine();
	        BigInteger num = new BigInteger(n);

	        if (num.equals(BigInteger.ONE)) {
	            System.out.println("not prime");
	        } else {
	            if (num.isProbablePrime(10)) {	
	                System.out.println("prime");
	            } else {
	                System.out.println("not prime");
	            }
	        }	
	        bufferedReader.close();
	    }
		
}

