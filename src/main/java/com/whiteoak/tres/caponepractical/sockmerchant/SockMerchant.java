package com.whiteoak.tres.caponepractical.sockmerchant;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

@Component
public class SockMerchant {

	@Autowired
	private BufferedWriter bufferedWriter;
	@Autowired
	private BufferedReader bufferedReader;
	
	
    public SockMerchant(BufferedWriter bufferedWriter, BufferedReader bufferedReader) {
		this.bufferedWriter = bufferedWriter;
		this.bufferedReader = bufferedReader;
	}


	/*
     * 
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public int doWork(int n, List<Integer> ar) {
    // Write your code here
    	
    	//https://www.hackerrank.com/challenges/sock-merchant/problem
    	return 2;
    }

    public void runAlgorithm() throws IOException {
    	bufferedWriter.write("Welcome to Sock Merchant");
    	bufferedWriter.write("The function accepts following parameters:1. INTEGER n 2. INTEGER_ARRAY ar");
    	bufferedWriter.flush();
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = doWork(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
    }
}
