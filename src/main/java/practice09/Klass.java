package practice09;


import java.util.ArrayList;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;
    private ArrayList<Student> studentList = new ArrayList<>();
    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public Student getLeader() {
        return leader;
    }
    private void setLeader(Student leader) {
        this.leader = leader;
    }
    public void assignLeader(Student student){
        if(this.isInKlass(student)) {
            student.getKlass().setLeader(student);
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember(Student student) {
        student.setKlass(this);
    }
    public boolean isInKlass(Student student) {
        return student.getKlass() == this;
    }
}
