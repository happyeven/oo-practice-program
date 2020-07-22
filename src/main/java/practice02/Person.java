package practice02;

public class Person {
    protected String name;
    protected int age;

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void selfIntroduce(){
        System.out.println("My name is " + this.name + ". I am "+ this.name + " years old.");
    }
}
