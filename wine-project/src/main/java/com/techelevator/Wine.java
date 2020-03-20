package com.techelevator;

public class Wine {
	
	private String brandName;
	private String varietal;
	private Integer vintage;
	private String color;
	private boolean isCarbonated;
	private double alcPercent;
	private String region;
	private String originCountry;
	
	public Wine(String brandName, String varietal, Integer vintage,
			String color, boolean isCarbonated, double alcPerecent, String region, String originCountry) {
		this.brandName =brandName;
		this.varietal = varietal;
		this.vintage = vintage;
		this.color = color;
		this.isCarbonated = isCarbonated;
		this.alcPercent = alcPerecent;
		this.region = region;
		this.originCountry = originCountry;
	}


	public String getBrandName() {
		return brandName;
	}


	public String getVarietal() {
		return varietal;
	}


	public Integer getVintage() {
		return vintage;
	}

	public String getColor() {
		return color;
	}

	public boolean isCarbonated() {
		return isCarbonated;
	}

	public void isCarbonated(boolean isCarbonated) {
		this.isCarbonated = isCarbonated;
	}

	public Double getAlcPercent() {
		return alcPercent;
	}

	
	
	public String getRegion() {
		return region;
	}


	public String getOriginCountry() {
		return originCountry;
	}



	@Override
	public String toString() {
		return "BrandName: " + brandName + 
				"\n" + "varietal: " + varietal + 
				"\n" + "vintage: " + vintage + 
				"\n" + "color: " + color +
				"\n" + "alcPercent: " + alcPercent + 
				"\n" + "Region: " + region + 
				"\n" + "Country: " + originCountry + "\n";
	}


	
}
	
	



