package main.java.me.model.person;

public class Main {

    private Person person = new Person("1", "Tom", 21);

    private Klass klass2 = new Klass(2);
    private Klass klass3 = new Klass(3);

    private Student student = new Student("2", "Li", 20, klass2);
    private Student student2 = new Student("9", "Sun", 20, klass3);
    private Teacher teacher = new Teacher("3", "Zhao", 34);

    public void personTest() {
        System.out.println(person.introduce());
    }

    public void studentTest() {
        klass2.registerAssignLeaderListener(teacher);
        klass2.registerJoinListener(teacher);
        System.out.println(student.introduce());
        klass2.assignLeader(student);
        System.out.println(student.introduce());
        klass2.assignLeader(student2);
        klass2.appendMember(student2);
    }

    public void teacherTest() {
        System.out.println(teacher.introduce());
        teacher.addKlass(klass2);
        teacher.addKlass(klass3);
        System.out.println(teacher.introduce());
        System.out.println(teacher.isTeaching(student));
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.personTest();
        main.studentTest();
        main.teacherTest();
    }
}
