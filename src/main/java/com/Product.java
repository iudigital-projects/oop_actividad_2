package com;

class Product {
  private String id;
  private String name;
  private String category;
  private double price;
  private int stock;
  private boolean available;

  Product(String id, String name, String category, double price, int stock, boolean available) {
    this.id = id;
    this.name = name;
    this.category = category;
    this.price = price;
    this.stock = stock;
    this.available = available;
  }

  public void printInfo() {
    System.out.println("---------PRODUCT INFO-----");
    System.out.println("Id: " + this.id);
    System.out.println("name: " + this.name);
    System.out.println("category: " + this.category);
    System.out.println("price: " + "$" + this.price);
    System.out.println("stock: " + this.stock);
    System.out.println("available: " + this.available);
  }

  public void priceDiscount(double percentage) {
    this.price = this.price - (this.price * (percentage * 0.01));
  }

  public void restock(int stock) {
    this.stock += stock;
  }

  public void toggleAvailability() {
    this.available = !this.available;
  }

  public void sell(int quantity) {
    this.stock -= quantity;
  }

}
