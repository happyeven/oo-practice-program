package practice08;


public class Person {
    protected String name;
    protected int age;
    protected int id;

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
    public Person(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Person person = (Person)obj;
        return person.id == this.id;
    }
}


