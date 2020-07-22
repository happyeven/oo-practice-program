package practice04;

import practice02.Person;

public class Student extends Person {
    private int klass;

    public Student(String name, int age,int klass){
        super(name,age);
        this.klass = klass;
    }
    public Student(String name, int age) {
        super(name,age);
    }
    @Override
    public String introduce(){
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d.", this.name, this.age,this.klass);
    }

    public int getKlass() {
        return klass;
    }
}
