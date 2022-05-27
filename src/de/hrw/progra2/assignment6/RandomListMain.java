package de.hrw.progra2.assignment6;

public class RandomListMain {
    public static void main(String[] args) {


    RandomList list = new RandomList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(5L);

        for(int i = 0; i< 12; i++){
            System.out.println(list.get());
    }
}
}