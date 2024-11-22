package lab5;


class Product {
 private int productId;
 private String name;
 private int categoryId;
 private double unitPrice;


 public Product(int productId, String name, int categoryId, double unitPrice) {
     this.productId = productId;
     this.name = name;
     this.categoryId = categoryId;
     this.unitPrice = unitPrice;
 }

 
 public int getProductId() {
     return productId;
 }

 public void setProductId(int productId) {
     this.productId = productId;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getCategoryId() {
     return categoryId;
 }

 public void setCategoryId(int categoryId) {
     this.categoryId = categoryId;
 }

 public double getUnitPrice() {
     return unitPrice;
 }

 public void setUnitPrice(double unitPrice) {
     this.unitPrice = unitPrice;
 }

 
 public void displayDetails() {
     System.out.println("Product ID: " + productId);
     System.out.println("Name: " + name);
     System.out.println("Category ID: " + categoryId);
     System.out.println("Unit Price: $" + unitPrice);
 }
}


class ElectricalProduct extends Product {
 private String voltageRange;
 private int wattage;


 public ElectricalProduct(int productId, String name, int categoryId, double unitPrice, String voltageRange, int wattage) {
     super(productId, name, categoryId, unitPrice);
     this.voltageRange = voltageRange;
     this.wattage = wattage;
 }

 
 public String getVoltageRange() {
     return voltageRange;
 }

 public void setVoltageRange(String voltageRange) {
     this.voltageRange = voltageRange;
 }

 public int getWattage() {
     return wattage;
 }

 public void setWattage(int wattage) {
     this.wattage = wattage;
 }

 
 public void updateWattageAndPrice(int newWattage, double newPrice) {
     setWattage(newWattage);
     setUnitPrice(newPrice);
     System.out.println("Wattage and Unit Price updated successfully.");
 }


 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Voltage Range: " + voltageRange);
     System.out.println("Wattage: " + wattage + "W");
 }
}


public class Main {
 public static void main(String[] args) {
   
     ElectricalProduct ep = new ElectricalProduct(101, "LED Bulb", 12, 15.99, "220V-240V", 10);

    
     System.out.println("Initial Electrical Product Details:");
     ep.displayDetails();

    
     ep.updateWattageAndPrice(12, 18.99);

     
     System.out.println("\nUpdated Electrical Product Details:");
     ep.displayDetails();
 }
}

