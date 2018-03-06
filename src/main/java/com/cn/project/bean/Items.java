package com.cn.project.bean;

public class Items {

	 private String itemsName;
	 
	 private String itemsColor;
	 
	 private float itemsPrice;

	public String getItemsName() {
		return itemsName;
	}

	public void setItemsName(String itemsName) {
		this.itemsName = itemsName;
	}

	public String getItemsColor() {
		return itemsColor;
	}

	public void setItemsColor(String itemsColor) {
		this.itemsColor = itemsColor;
	}

	public float getItemsPrice() {
		return itemsPrice;
	}

	public void setItemsPrice(float itemsPrice) {
		this.itemsPrice = itemsPrice;
	}

	public Items(String itemsName, String itemsColor, float itemsPrice) {
		super();
		this.itemsName = itemsName;
		this.itemsColor = itemsColor;
		this.itemsPrice = itemsPrice;
	}

	public Items() {
		super();
	}
	 
}
