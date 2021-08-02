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

import static java.lang.Math.abs;
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
    int steps_remaining = steps;
    int height = 0;
    boolean in_valley = false;
    int valleys_traversed = 0;
    char down_char = "D".charAt(0);

		for (char step: path.toCharArray()) {
			if (step == down_char) {
				height -= 1;
				if (!in_valley && height == -1) {
					in_valley = true;
				}
			}
			else {
				height += 1;
				if (in_valley && height == 0) {
					in_valley = false;
					valleys_traversed += 1;
				}
			}
			steps_remaining -=1;
			if (abs(height)> steps_remaining){break;}

		}
		return valleys_traversed;
    // https://www.hackerrank.com/challenges/counting-valleys/problem
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
