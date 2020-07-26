package practice11;


public class Student extends Person{
    private Klass klass;

    public Student(int id,String name, int age, Klass klass) {
        super(id,name, age);
        this.klass = klass;
    }
    @Override
    public String introduce() {
        Student leader = this.klass.getLeader();
        String leaderString = leader != null && leader.getName() == this.getName() ?
                String.format("I am Leader of Class %d.", this.getKlass().getNumber())
                : String.format("I am at Class %d.", this.klass.getNumber());
        return String.format("%s I am a Student. %s", super.introduce(), leaderString);
    }
    public Klass getKlass() {
        return klass;
    }
    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}
