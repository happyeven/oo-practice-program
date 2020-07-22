package practice02;
import practice02.Person;
public class Student extends Person{
    //add overvide
    public Student(String name, int age){
        super(name,age);
    }
    public String introduce(){
        String introduceMessage = "My name is " + this.name + ". I am "+ this.name + " years old. Coding for the glory of OOCL.";
        return introduceMessage;
    }
}
