package CollectionProgram.Queue;

class Student implements Comparable<Student>{

    private String name;
    private int marks;
    private int rollNo;

    public Student(int marks, String name, int rollNo) {
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", rollNo=" + rollNo +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }
}


