package practice11;


import java.util.ArrayList;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<TeacherObserver> observerList = new ArrayList<>();
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
        if(this.isIn(student)) {
            student.getKlass().setLeader(student);
            for(TeacherObserver teacherObserver : observerList){
                teacherObserver.printGetSetLeaderMessage(student,this);
            }
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember(Student student) {
        studentList.add(student);
        for(TeacherObserver teacherObserver : observerList){
            teacherObserver.printGetJoinMessage(student,this);
        }
    }
    public boolean isIn(Student student) {
        return studentList.contains(student);
    }
    public void addTeacher(Teacher teacher) {
        this.observerList.add(teacher);
    }
}
