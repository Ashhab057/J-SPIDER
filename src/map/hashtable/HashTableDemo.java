package map.hashtable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        System.out.println("Program starts.......");

        Hashtable<Integer , String> h1 = new Hashtable<>();

        h1.put(1 , "a");
        h1.put(2 , "b");
        h1.put(3, "c");
        System.out.println(h1.get(3));




        System.out.println("Program starts.......");
    }
}
