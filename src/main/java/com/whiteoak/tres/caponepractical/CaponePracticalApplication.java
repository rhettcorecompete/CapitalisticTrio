package com.whiteoak.tres.caponepractical;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.whiteoak.tres.caponepractical.sockmerchant.SockMerchant;
import com.whiteoak.tres.caponepractical.valleycount.ValleyCount;

@SpringBootApplication
@ComponentScan({"org.whiteoak.tres.caponpractical.sockmerchant, org.whiteoak.tres.caponepractical.countvalley"})
public class CaponePracticalApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(CaponePracticalApplication.class, args);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out)); //new FileWriter(System.getenv("OUTPUT_PATH")));

		bufferedWriter.write("Starting application.");
		bufferedWriter.write("Please type 1 for Sock Merchant or 2 for Valley Counting. then press <enter>.");
		bufferedWriter.flush();
		int n = Integer.parseInt(bufferedReader.readLine().trim());
		switch  (n) {
		case 1: 
			SockMerchant sock = new SockMerchant(bufferedWriter,bufferedReader);
			sock.runAlgorithm();
			break;
		case 2:
			ValleyCount valley = new ValleyCount(bufferedWriter,bufferedReader);
			valley.runAlgorithm();
			break;
		default: break;
		}
        bufferedReader.close();
        bufferedWriter.close();
	
		
	}

}
