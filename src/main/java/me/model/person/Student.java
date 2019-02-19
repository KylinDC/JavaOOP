package main.java.me.model.person;

public class Student extends Person {
    private Klass klass;

    public Student(String id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String basicInfo = super.introduce() + " I am a Student.";
        if (this.klass.getLeader() == this) {
            return basicInfo + " I am Leader of Class " + this.klass.getNumber() + ".";
        }
        return basicInfo;
    }
}
