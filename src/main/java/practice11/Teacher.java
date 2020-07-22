package practice11;


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
        List<Integer> classNumList = new ArrayList<>();
        for(Klass klass : classes){
            classNumList.add(klass.getNumber());
        }
        return classNumList.contains(student.getKlass().getNumber()) ? true:false;
    }
    public String introduceWith(Student student){
//        String teacherIntroductionWith = this.getKlass().getNumber() == student.getKlass().getNumber() ? "" : " don't";
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
