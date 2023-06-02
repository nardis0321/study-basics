package basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatTheYodaSaid {
	private static int NUM_OF_WORDS_TO_MOVE = 2; //뒤로 옮길 단어의 수
	
	public StringBuilder makeItYodaWay(BufferedReader br) throws NumberFormatException, IOException {
		int sentenceQuantity = Integer.parseInt(br.readLine()); //바꿀 문장 수 입력받기
		StringBuilder whatYodaSay = new StringBuilder();
		
		while(sentenceQuantity-->0) {
			String[] words = br.readLine().split(" "); //문장 입력받아 단어로 쪼갬
			br.close();
			
			for(int i = NUM_OF_WORDS_TO_MOVE; i<=words.length-1; i++) {
				whatYodaSay.append(words[i]).append(" ");
			}
			for(int i = 0; i<=NUM_OF_WORDS_TO_MOVE-2; i++) {
				whatYodaSay.append(words[i]).append(" ");
			}
			whatYodaSay.append(words[NUM_OF_WORDS_TO_MOVE-1]).append("\n");
		}

		return whatYodaSay;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		WhatTheYodaSaid yoda = new WhatTheYodaSaid();
		System.out.println(yoda.makeItYodaWay(br));
		
	}

}
