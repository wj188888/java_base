package oop.demo02;

public class Pet {
    String name;
    int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void shout(){
        System.out.println("叫了一声");
    }
}
