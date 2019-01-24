package model;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("hk39");
        student.setName("Saku");
        student.setAge(16);
        student.setGender("female");

        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
    }
}
