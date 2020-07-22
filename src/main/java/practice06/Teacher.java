package practice06;

public class Teacher extends Person{
    private int klass;
    public Teacher(String name,int age,int klass){
        super(name,age);
        this.klass = klass;
    }
    /*
     * if use this constructor,
     * will set the value of klass into -1
     */
    public Teacher(String name,int age){
        super(name,age);
        this.klass = -1;
    }
    @Override
    public String introduce() {
        String teacherIntroduction = this.getKlass() == -1 ? " I am a Teacher. I teach No Class." : " I am a Teacher. I teach Class " + this.klass +".";
        return super.introduce() + teacherIntroduction;
    }
    public int getKlass() {
        return klass;
    }
    public void setKlass(int klass) {
        this.klass = klass;
    }
}
