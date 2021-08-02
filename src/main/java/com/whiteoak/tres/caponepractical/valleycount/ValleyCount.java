package com.whiteoak.tres.caponepractical.valleycount;

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
public class ValleyCount {

	@Autowired
	private BufferedWriter bufferedWriter;
	@Autowired
	private BufferedReader bufferedReader;
	
	
    public ValleyCount(BufferedWriter bufferedWriter, BufferedReader bufferedReader) {
		this.bufferedWriter = bufferedWriter;
		this.bufferedReader = bufferedReader;
	}


    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public int doWork(int steps, String path) {
    // Write your code here
    	
    // https://www.hackerrank.com/challenges/counting-valleys/problem
    	return 2;
    }


    public void runAlgorithm() throws IOException {
    	bufferedWriter.write("Welcome to Valley Count");
    	bufferedWriter.write("The function accepts following parameters:1. INTEGER step *  2. STRING path");
    	bufferedWriter.flush();
        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = doWork(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

    }
    
}
