package practice08;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;
    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
    }
    public int getNumber() {
        return number;
    }
    public String getDisplayName() {
        return displayName;
    }
    public Student getLeader() {
        return leader;
    }
    private void setLeader(Student leader) {
        this.leader = leader;
    }
    public void assignLeader(Student student){
        this.setLeader(student);
    }
}
