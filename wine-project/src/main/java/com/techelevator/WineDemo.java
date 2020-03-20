package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WineDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		WineCellar cellar = new WineCellar();
		boolean done = false;

		ArrayList<Wine> wineList = cellar.getWineList();

		while (!done) {
			System.out.println("1) Display all Wines");
			System.out.println("2) Display Red Wines");
			System.out.println("3) Display White Wines");
			System.out.println("4) Display Rose Wines");
			System.out.println("5) Display Sparkling Wines");
			System.out.println("6) Quit");

			int option = Integer.parseInt(input.nextLine());

			switch (option) {

			case 1:
				for (int i = 0; i < wineList.size(); i++) {
					System.out.println(wineList.get(i).toString());
				}
				break;

			case 2:
				for (int i = 0; i < wineList.size(); i++) {
					if (wineList.get(i).getColor().substring(0, 2).equals("Re")) {
						System.out.println(wineList.get(i).toString());
					}
				}
				break;
			case 3:
				for (int i = 0; i < wineList.size(); i++) {
					if (wineList.get(i).getColor().substring(0, 1).equals("W")) {
						System.out.println(wineList.get(i).toString());
					}
				}
				break;

			case 4:
				for (int i = 0; i < wineList.size(); i++) {
					if (wineList.get(i).getColor().substring(0, 2).equals("Ro")) {
						System.out.println(wineList.get(i).toString());
					}
				}
				break;
			case 5:
				for (int i = 0; i < wineList.size(); i++) {
					if (wineList.get(i).isCarbonated() == true) {
						System.out.println(wineList.get(i).toString());
					}
				}
				break;

			}
		}
	}
}
/*
 * String choiceRedWhiteRoseOrSparkling = input.nextLine();
 * 
 * for (int i = 0; i < wineList.size(); i++) {
 * 
 * if (choiceRedWhiteRoseOrSparkling.equalsIgnoreCase("R") &&
 * (wineList.get(i).getColor().substring(0, 2).equals("Re"))) {
 * System.out.print("Red Wine: ");
 * System.out.println(wineList.get(i).toString());
 * 
 * } else if (choiceRedWhiteRoseOrSparkling.equalsIgnoreCase("W") &&
 * wineList.get(i).getColor().substring(0, 1).equals("W")) {
 * 
 * System.out.print("White Wine: ");
 * System.out.println(wineList.get(i).toString());
 * 
 * } else if (choiceRedWhiteRoseOrSparkling.equalsIgnoreCase("RO") &&
 * wineList.get(i).getColor().substring(0, 2).equals("Ro")) {
 * 
 * System.out.println("Here are your Rose's!");
 * System.out.println(wineList.get(i).toString());
 * 
 * } else if (choiceRedWhiteRoseOrSparkling.equalsIgnoreCase("S") &&
 * wineList.get(i).isCarbonated()) {
 * 
 * System.out.println("Here are your Sparkling Wines!");
 * System.out.println(wineList.get(i).toString());
 * 
 * input.close(); } } } }
 */
