class BetterBasketTest {
	
	void testMergeAddproduct() {
		BetterBasket b = new BetterBasket();
		Product p1 =  new Product("0001" , "Toaster", 10.00, 1);
		Product p2 =  new Product("0001" , "Toaster", 10.00, 1);
		Product p3 =  new Product("0002" , "Kettle", 15.00, 1);
		Product p4 =  new Product("0002" , "Kettle", 15.00, 2);
		b.add(p1);
		b.add(p2);
		assertEquals(1,b.size(), "Size Incorrect after merge");
		assertEquals(2,b.get(0).getQuantity(), "Quantity incorrect after merge");
		b.add(p3);
		assertEquals(2,b.size(), "Size Incorrect after non-merge")
		b.add(p4);
		assertEquals(3,b.get(1).getQuantity(), "Quantity incorrect after reverse merge");
		
		
	}
	void testSortAddProduct() {
		BetterBasket b = new BetterBasket();
		Product p1 =  new Product("0001" , "Toaster", 10.00, 1);
		Product p2 =  new Product("0002" , "Micorrwave", 10.00, 1);
		Product p3 =  new Product("0003" , "Kettle", 15.00, 1);
		b.add(p3);
		b.add(p1);
		assertsEquals("0001", b.get(0).getProductNum(), "Product missorted");
		assertsEquals("0003", b.get(1).getProductNum(), "Product missorted");
		
		b.add(p2);
		assertsEquals("0001", b.get(0).getProductNum(), "Product Incorrect after insert");
		assertsEquals("0002", b.get(1).getProductNum(), "Product Incorrect after insert");
		assertsEquals("0003", b.get(3).getProductNum(), "Product Incorrect after insert");
		
	}
}

