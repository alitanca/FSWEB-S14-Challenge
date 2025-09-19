
package org.example.models;

public class DeluxeBurger extends Hamburger {
    private final String cips;
    private final String drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "DOUBLE", 19.10, "DOUBLE SANDWICH");
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() { return cips; }
    public String getDrink() { return drink; }

    @Override public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
    @Override public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
    @Override public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }
    @Override public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez");
    }

    @Override
    public double itemizeHamburger() {
        return getPrice();
    }
}
