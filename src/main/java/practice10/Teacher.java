package practice10;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    private LinkedList<Klass> classes;
    public Teacher(int id ,String name, int age,LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
    }
    public Teacher(int id ,String name, int age) {
        super(id,name,age);
        this.classes = new LinkedList<>();
    }
    @Override
    public String introduce() {
        if(this.classes.size() == 0){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        String classNumStr = "";
        for(Klass klass : this.classes){
            classNumStr += klass.getNumber() + ", ";
        }
        return super.introduce() + " I am a Teacher. I teach Class " +
                classNumStr.substring(0,classNumStr.length() - 2) + ".";
    }
    public boolean isTeaching(Student student){
        return classes.contains(student.getKlass());
    }
    public String introduceWith(Student student){
        String teacherIntroductionWith = isTeaching(student) ? "" : " don't";
        return getIntroductionTemplete(teacherIntroductionWith,student.getName());
    }

    public String getIntroductionTemplete(String teacherIntroductionWith,String studentName){
        return super.introduce() + " I am a Teacher. I" + teacherIntroductionWith + " teach " + studentName + ".";
    }
    public LinkedList<Klass> getClasses() {
        return classes;
    }
    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }
}
