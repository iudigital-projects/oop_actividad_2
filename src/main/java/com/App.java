package com;

public class App 
{
    public static void main( String[] args )
    {
      Product tShirt = new Product("A1", "T-Shirt Dorohedoro", "Shirts", 195000, 40, true);
      tShirt.priceDiscount(10);
      tShirt.restock(10);
      tShirt.sell(20);
      tShirt.toggleAvailability();
      tShirt.printInfo();

      Product tunaCan = new Product("B1", "Tuna Can Vam Camps in Oil", "Food", 15000, 100, true); 
      tunaCan.priceDiscount(20);
      tunaCan.restock(50);
      tunaCan.sell(30);
      tunaCan.toggleAvailability();
      tunaCan.printInfo();

      Product laptop = new Product("C1", "Laptop Asus ROG Strix G15", "Electronics", 15000000, 20, true);
      laptop.priceDiscount(15);
      laptop.restock(5);
      laptop.sell(2);
      laptop.toggleAvailability();
      laptop.printInfo();

      Product book = new Product("D1", "Book The Great Gatsby", "Books", 75000, 30, true);
      book.priceDiscount(5);
      book.restock(20);
      book.sell(10);
      book.toggleAvailability();
      book.printInfo();

      Product sneakers = new Product("E1", "Sneakers Nike Air Max 270", "Footwear", 2000000, 15, true);
      sneakers.priceDiscount(25);
      sneakers.restock(10);
      sneakers.sell(5);
      sneakers.toggleAvailability();
      sneakers.printInfo();
    }
}
