package de.hrw.progra2.assignment7;

import java.util.Objects;

public class CoffeeToGo implements Comparable<CoffeeToGo> {

    public static final AmountComparator AMOUNT_COMPARATOR = new AmountComparator();

    public static final ProductNameComparator PRODUCT_NAME_COMPARATOR = new ProductNameComparator();

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

    @Override
    public String toString() {
        return "CoffeeToGo{" +
                "productName='" + productName + '\'' +
                ", caffeineContent=" + caffeineContent +
                ", containsMilk=" + containsMilk +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeToGo that = (CoffeeToGo) o;
        return Double.compare(that.caffeineContent, caffeineContent) == 0
                && containsMilk == that.containsMilk
                && Double.compare(that.amount, amount) == 0
                && Objects.equals(productName, that.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, caffeineContent, containsMilk, amount);
    }


    @Override
    public int compareTo(CoffeeToGo coffee){
        if (caffeineContent > coffee.getCaffeineContent()) {
            return 1;
        } else if (caffeineContent < coffee.getCaffeineContent()) {
            return -1;
        } else {
            return 0;
        }
    }


}


