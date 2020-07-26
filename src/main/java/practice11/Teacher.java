package practice11;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person implements TeacherObserver{
    private LinkedList<Klass> classes;
    public Teacher(int id ,String name, int age,LinkedList<Klass> classes) {
        super(id,name, age);
        this.classes = classes;
        for(Klass klass : classes){
            klass.addTeacher(this);
        }
    }
    public Teacher(int id ,String name, int age) {
        super(id,name,age);
        this.classes = new LinkedList<>();
    }
    @Override
    public String introduce() {
        if(this.classes.size() == 0){
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        }
        String classNumStr = classes.stream().map(n -> String.valueOf(n.getNumber())).collect(Collectors.joining(", "));
        return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), classNumStr);
    }
    public boolean isTeaching(Student student){
        return classes.contains(student.getKlass());
    }
    public String introduceWith(Student student){
        String teacherIntroductionWith = isTeaching(student) ? "" : " don't";
        return getIntroductionTemplete(teacherIntroductionWith,student.getName());
    }

    public String getIntroductionTemplete(String teacherIntroductionWith,String studentName){
        return String.format("%s I am a Teacher. I%s teach %s.", super.introduce(), teacherIntroductionWith, studentName);
    }
    public LinkedList<Klass> getClasses() {
        return classes;
    }
    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }
    @Override
    public void printGetJoinMessage(Student student ,Klass klass){
        System.out.print(new StringBuilder().append("I am ").append(this.name).append(". I know ").append(student.getName()).append(" has joined Class ").append(klass.getNumber()).append(".\n").toString());
    }
    @Override
    public void printGetSetLeaderMessage(Student student,Klass klass){
        System.out.printf("I am %s. I know %s become Leader of Class %d.\n", this.name, student.getName(), klass.getNumber());
    }
}
