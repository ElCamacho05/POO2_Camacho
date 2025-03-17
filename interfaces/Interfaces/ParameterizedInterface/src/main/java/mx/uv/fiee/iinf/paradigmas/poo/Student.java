package mx.uv.fiee.iinf.paradigmas.poo;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString () {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                " }";
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }
}