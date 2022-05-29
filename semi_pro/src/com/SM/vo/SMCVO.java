package com.SM.vo;

import java.sql.Date;

// Stock Manager Control Volume Object
public class SMCVO {
	private int Product_no;
	private String Brand_name;
	private String Style_no;
	private String Store;
	private String Product_name;
	private int Price;
	private int Sale_price;
	private int Cost_price;
	private String Sale_per;
	private String Margin_per;
	private int Margin_won;
	private int Stock;
	private String ManagerID;
	private Date Regi_date;
	private Date Edit_date;
	
	public int getProduct_no() {
		return Product_no;
	}
	public void setProduct_no(int product_no) {
		Product_no = product_no;
	}
	public String getBrand_name() {
		return Brand_name;
	}
	public void setBrand_name(String brand_name) {
		Brand_name = brand_name;
	}
	public String getStyle_no() {
		return Style_no;
	}
	public void setStyle_no(String style_no) {
		Style_no = style_no;
	}
	public String getStore() {
		return Store;
	}
	public void setStore(String store) {
		Store = store;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getSale_price() {
		return Sale_price;
	}
	public void setSale_price(int sale_price) {
		Sale_price = sale_price;
	}
	public int getCost_price() {
		return Cost_price;
	}
	public void setCost_price(int cost_price) {
		Cost_price = cost_price;
	}
	public String getSale_per() {
		return Sale_per;
	}
	public void setSale_per(String sale_per) {
		Sale_per = sale_per;
	}
	public String getMargin_per() {
		return Margin_per;
	}
	public void setMargin_per(String margin_per) {
		Margin_per = margin_per;
	}
	public int getMargin_won() {
		return Margin_won;
	}
	public void setMargin_won(int margin_won) {
		Margin_won = margin_won;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getManagerID() {
		return ManagerID;
	}
	public void setManagerID(String managerID) {
		ManagerID = managerID;
	}
	public Date getRegi_date() {
		return Regi_date;
	}
	public void setRegi_date(Date regi_date) {
		Regi_date = regi_date;
	}
	public Date getEdit_date() {
		return Edit_date;
	}
	public void setEdit_date(Date edit_date) {
		Edit_date = edit_date;
	}

	
	
}
