package practice02;

public class Student extends Person{
    private int klass;

    public Student(String name, int age,int klass){
        super(name,age);
        this.klass = klass;
    }
    public Student(String name, int age) {
        super(name,age);
    }
    public String introduce(){
        String introduceMessage = "I am a Student. I am at Class "+ this.klass+".";
        return introduceMessage;
    }

    public int getKlass() {
        return klass;
    }
}
