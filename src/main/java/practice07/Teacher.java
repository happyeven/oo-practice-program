package practice07;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public String introduce() {
        String teacherIntroduction = this.getKlass() == null ? "No Class." : "Class " + this.klass.getNumber() +".";
        return super.introduce() + " I am a Teacher. I teach " + teacherIntroduction;
    }
    public String introduceWith(Student student){
        String teacherIntroductionWith = this.getKlass().getNumber() == student.getKlass().getNumber() ? "" : " don't";
        return getIntroductionTemplete(teacherIntroductionWith,student.getName());
    }
    public Klass getKlass() {
        return klass;
    }
    public void setKlass(Klass klass) {
        this.klass = klass;
    }
    public String getIntroductionTemplete(String teacherIntroductionWith,String studentName){
        return super.introduce() + " I am a Teacher. I" + teacherIntroductionWith + " teach " + studentName + ".";
    }
}
