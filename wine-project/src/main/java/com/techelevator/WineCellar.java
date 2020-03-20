package com.techelevator;

import java.util.ArrayList;


public class WineCellar {


	public ArrayList<Wine> getWineList() {
		ArrayList<Wine> wineList = new ArrayList<>();

		wineList.add(new Wine("Rechsteiner", "Prosecco", 2018, "White", true, 11.0, "Friuli Venezia Giulia", "Italy"));
		wineList.add(new Wine("Val Di Toro", "Rose", 2018, "Rose", false, 13.0, "Tuscany", "Italy"));
		wineList.add(new Wine("Taliano", "Arneis", 2019, "White", false, 13.0, "Piemonte", "Italy"));
		wineList.add(new Wine("Rechsteiner", "Suavignon Blanc", 2017, "White", false, 12.5,"Friuli Venezia Giulia", "Italy"));
		wineList.add(new Wine("Sticcano", "Chianti", 2016, "Red", false, 13.0, "Tuscany", "Italy"));
		wineList.add(new Wine("Le Calendre", "Amarone", 2014, "Red", false, 16.0,"Veneto", "Italy"));
		wineList.add(new Wine("Taliano", "Nebbiolo", 2017, "Red", false, 16.0, "Piemonte", "Italy"));
		wineList.add(new Wine("Abito", "Malbec", 2018, "Red", false, 14.5, "Mendoza", "Argentina"));
		wineList.add(new Wine("Abito", "Cabernet Franc",2017, "Red", false, 15.0, "Mendoza", "Argentina"));
		wineList.add(new Wine("Pina", "Cabernet Sauvignon", 2015, "Red", false, 15.0, "Yountville - Napa", "California"));
		wineList.add(new Wine("Sibilia", "Cabernet Sauvignon", 2015, "Red", false, 14.0, "Sicily", "Italy"));
		wineList.add(new Wine("Sibilia", "Cabernet Sauvignon", 2016, "Red", false, 14.0, "Sicily", "Italy"));
		wineList.add(new Wine("Capo Soprano", "Grillo", 2017, "White", false, 14.0, "Sicily", "Italy"));
		wineList.add(new Wine("Antica Fratta", "Rose Brut Sparkling", 2018, "Rose", true, 13.0, "Lombardy", "Italy"));
		wineList.add(new Wine("Carillon", "Rosso Di Montalcino", 2017, "Red", false, 15.0, "Montalcino", "Italy"));
		wineList.add(new Wine("Carillon", "Rosso Di Montalcino", 2017, "Red", false, 15.0, "Montalcino", "Italy"));
		wineList.add(new Wine("Fratelli Vogadori", "Ripasso Valpolicella", 2017, "Red", false, 13.0, "Vapolicella", "Italy"));
		wineList.add(new Wine("Pope Valley", "Cabernet Sauvignon", 2017, "Red", false, 15.0, "Napa Valley", "California"));
		wineList.add(new Wine("Le Calendre", "Amrone", 2017, "Red", false, 14.0, "Valpolicella", "Italy"));
		
		
		
		
		return wineList;
	}



		
	}


