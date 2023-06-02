package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatTheYodaSaid {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sentenceQuantity = Integer.parseInt(br.readLine());
		
		while(sentenceQuantity-->0) {
			String[] words = br.readLine().split(" ");
			for(int i=2; i<=words.length-1; i++) {
				System.out.print(words[i]+" ");
			}
			System.out.println(words[0]+" "+words[1]);
		}
	}

}
