package com.obsqura.aggreggation;

public class LineItemProduct {
	float qty;
	Product product;

	public LineItemProduct(float qty, Product product) {
		super();
		this.qty = qty;
		this.product = product;
	}
	void printPdtdtls() {
		System.out.println("Line Item Product Details");
		System.out.println("Name :"+product.pdtNm+'\n'+"ID: "+product.pdtId+'\n'+"Description: "+product.pdtDesc);
		System.out.println("Quantity: "+qty);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product pdt1 = new Product("CK101","CK","CHOCO CAKE");
		LineItemProduct lp1 = new LineItemProduct(5,pdt1);
		lp1.printPdtdtls();
	}
}
