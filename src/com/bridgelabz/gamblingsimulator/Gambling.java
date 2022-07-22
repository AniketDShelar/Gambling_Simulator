package com.bridgelabz.gamblingsimulator;

public class Gambling {
	static int stake = 100;
	static int dailybet = 1;
	public static void gambler() {
			int result = (int) Math.floor(Math.random() * 10 % 2);
			if(dailybet == result) {
			System.out.println("Winner");
			stake =stake + 50;
			System.out.println("Total Stake after winning : " +stake);
			}else{
			System.out.println("loser");
			stake =stake - 50;
			System.out.println("Total Stake after losing : " +stake);
		}
	}

	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator Program");
		gambler();
	}

}