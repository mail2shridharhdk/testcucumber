package com.smalltest.sample.cucumber;

public class Color {

	private String col;
	public Color(String col)
	{
		this.col= col;
	}
	
	@Override
	public String toString()
	{
		return "Color:"+col;
	}
}
