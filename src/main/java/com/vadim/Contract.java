package com.vadim;

public class Contract {
	String name;
	int quantity;
	float price;
	float commission=1;
	
	Contract(String name,  int quantity, float price)
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	float getPrice()
	{
		return price;
	}
	
	void setPrice(float price)
	{
		this.price = price;
	}
	
	int getQuantity()
	{
		return quantity;
	}
	
	void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	String getName()
	{
		return name;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	float getCommission()
	{
		return commission;
	}
	
	float getSlippage(float vix)
	{
		return (float)1.0;
	}
}


