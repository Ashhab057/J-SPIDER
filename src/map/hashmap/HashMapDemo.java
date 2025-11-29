package map.hashmap;


import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        System.out.println("Program Start.......");

        HashMap<Integer , String> h1 = new HashMap<>();

        h1.put(1 , "a");
        h1.put(2 , "b");
        h1.put(3, "c");
        System.out.println(h1);


        System.out.println("Program end.......");
    }
}
