package main.java.me.model.person;

public class Klass {
    private int number;
    private Student leader;
    private Teacher assignLeaderListener;
    private Teacher joinListener;

    public Klass(int number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if (leader.getKlass() == this) {
            this.leader = leader;
            if (assignLeaderListener != null) {
                assignLeaderListener.announceAssignLeader(leader);
            }
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if (joinListener != null) {
            joinListener.announceAppendMember(student);
        }
    }

    public boolean isIn(Student student) {
        return student.getKlass() == this;
    }

    public void registerAssignLeaderListener(Teacher assignLeaderListener) {
        this.assignLeaderListener = assignLeaderListener;
    }

    public void registerJoinListener(Teacher joinListener) {
        this.joinListener = joinListener;
    }
}
