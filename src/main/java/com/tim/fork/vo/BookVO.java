package com.tim.fork.vo;

public class BookVO {
	
	Integer bookId;
	String bookName;
	Float bookPrice;
	
	public BookVO(String name) {
		// TODO Auto-generated constructor stub
		this.setBookName(name);
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Float getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Float bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	

}
