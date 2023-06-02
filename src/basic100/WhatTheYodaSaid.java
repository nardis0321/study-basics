package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatTheYodaSaid {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sentenceQuantity = Integer.parseInt(br.readLine());
		
		while(sentenceQuantity-->0) {
			String sentence = br.readLine();
			String[] sentenceArray = sentence.split(" ");
			for(int j=2; j<=sentenceArray.length-1; j++) {
				System.out.print(sentenceArray[j]+" ");
			}
			System.out.print(sentenceArray[0]+" ");
			System.out.println(sentenceArray[1]);
		}
	}

}
