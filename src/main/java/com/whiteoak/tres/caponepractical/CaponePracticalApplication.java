package com.whiteoak.tres.caponepractical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CaponePracticalApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CaponePracticalApplication.class, args);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Starting application. enter an int");
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		System.out.println(n);
		
		
	}

}
