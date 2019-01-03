package com.paula.info.Sekcja4;

public class Child extends Parents {

	private String name;
	private String childEyeColor;

	public Child(String momEyeColor, String dadEyeColor) {
		super(momEyeColor, dadEyeColor);
	}

	public String setChildEyeColor() {

		String momEyeColor = super.getMomEyeColor();
		String dadEyeColor = super.getDadEyeColor();

		momEyeColor = momEyeColor.toLowerCase();
		dadEyeColor = dadEyeColor.toLowerCase();

		if (!(momEyeColor.equals("blue")) || !(momEyeColor.equals("green")) || !(momEyeColor.equals("brown"))) {
			childEyeColor = "incorrect eye color of Mother";
		}
		if (!(dadEyeColor.equals("blue")) || !(dadEyeColor.equals("green")) || !(dadEyeColor.equals("brown"))) {
			childEyeColor = "incorrect eye color of Dad";
		}

		return childEyeColor;

	}

	public String getChildEyeColor() {

		return childEyeColor;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
