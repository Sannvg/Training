package com.obsqura.aggreggation;

public class BookAuthor {
	String bknm;
	float bkprice;
	Author bkauthor;
	public BookAuthor(String bknm, float bkprice, Author bkauthor) {
		super();
		this.bknm = bknm;
		this.bkprice = bkprice;
		this.bkauthor = bkauthor;
	}
	void bookDetails() {
		System.out.println("Book Details");
		System.out.println("Book Name: "+bknm+'\n'+"Author: "+bkauthor.authnm+'\n'+"Book Price: "+bkprice);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author auth1 = new Author("Paulo Coelho","Brazil", 55);
		BookAuthor bk1 = new BookAuthor("The Alchemist",300f,auth1);
		bk1.bookDetails();
	}
}
