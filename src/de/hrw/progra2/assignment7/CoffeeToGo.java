package de.hrw.progra2.assignment7;

public class CoffeeToGo {
    private String productName;
    private double caffeineContent;
    private boolean containsMilk;
    private double amount;

    public CoffeeToGo(String productName, double coffeinContent, boolean containsMilk, double amount) {
        this.productName = productName;
        this.caffeineContent = coffeinContent;
        this.containsMilk = containsMilk;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getCaffeineContent() {
        return caffeineContent;
    }

    public void setCaffeineContent(double caffeineContent) {
        this.caffeineContent = caffeineContent;
    }

    public boolean isContainsMilk() {
        return containsMilk;
    }

    public void setContainsMilk(boolean containsMilk) {
        this.containsMilk = containsMilk;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
