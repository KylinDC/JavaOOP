package main.java.me.model.person;

import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<Klass> klasses = new ArrayList<Klass>();

    public Teacher(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        String basicInfo = super.introduce() + " I am a Teacher.";
        if (klasses.size() > 0) {
            ArrayList<String> klassesNumber = new ArrayList<String>();
            for (Klass klass : klasses) {
                klassesNumber.add(Integer.toString(klass.getNumber()));
            }
            return super.introduce() + " I teach Class" + String.join(", ", klassesNumber) + ".";
        } else {
            return basicInfo + " I teach No Class.";
        }
    }

    public void addKlass(Klass klass) {
        klasses.add(klass);
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : klasses) {
            if (klass.isIn(student)) {
                return true;
            }
        }
        return false;
    }

    public void announceAssignLeader(Student student) {
        System.out.println(
                "I am "
                        + this.getName()
                        + ". I know "
                        + student.getName()
                        + " become Leader of Class "
                        + student.getKlass().getNumber()
                        + ".");
    }

    public void announceAppendMember(Student student) {
        System.out.println(
                "I am "
                        + this.getName()
                        + ". I know "
                        + student.getName()
                        + " has joined Class "
                        + student.getKlass().getNumber()
                        + ".");
    }
}
