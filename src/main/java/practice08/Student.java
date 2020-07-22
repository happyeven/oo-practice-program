package practice08;

public class Student extends Person {
    private Klass klass;

    public Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }
    @Override
    public String introduce() {
        Student leader = this.klass.getLeader();
        String leaderString = leader != null && leader.getName() == this.getName() ? "I am Leader of Class " +
                this.getKlass().getNumber() + "." : "I am at Class " +
                this.klass.getNumber() +".";
        return super.introduce() + " I am a Student. " + leaderString;
    }
    public Klass getKlass() {
        return klass;
    }
    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}

