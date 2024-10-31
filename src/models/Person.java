package models;

public class Person {
    private String name;
    private int age;
    private String gender;

    //Empty constructor
    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void printInformation(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: "+ gender);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }
}
