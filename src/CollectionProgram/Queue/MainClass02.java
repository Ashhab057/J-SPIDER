package CollectionProgram.Queue;

import java.util.PriorityQueue;

public class MainClass02 {
    public static void main(String[] args) {
        System.out.println("Program start.......");

        PriorityQueue<Student> slist = new PriorityQueue<>();

        Student s1 = new Student(101, "Alif", 78);
        Student s2 = new Student(103, "Sheen", 68);
        Student s3 = new Student(102, "Aayn", 65);


        slist.add(s1);
        slist.add(s2);
        slist.add(s3);

        while(slist.isEmpty()!=true){
            System.out.println(slist.poll());
        }
        System.out.println("Program end.......");

    }
}
