package entity;

import java.util.Date;

public class Product {
	private int no;
	private String item;
	private int price;
	private Date regdate;
	@Override
	public String toString() {
		return "Product [no=" + no + ", item=" + item + ", price=" + price + ", regdate=" + regdate + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int no, String item, int price, Date regdate) {
		super();
		this.no = no;
		this.item = item;
		this.price = price;
		this.regdate = regdate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
