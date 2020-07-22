package practice02;

public class Person {
    protected String name;
    protected int age;

    protected Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "My name is " + this.name + ". I am "+ this.age + " years old.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
