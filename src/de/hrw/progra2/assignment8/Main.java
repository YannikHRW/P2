package de.hrw.progra2.assignment8;

public class Main {
    public static void main(String[] args) {
        Softdrink softdrink = Softdrink.COLA;
        System.out.println(EnumUtil.isBluffPackage(softdrink));
        System.out.println(EnumUtil.getSoftdrinkVersion("COLA"));
        System.out.println(EnumUtil.getSoftdrinkVersion("water"));
    }
}
