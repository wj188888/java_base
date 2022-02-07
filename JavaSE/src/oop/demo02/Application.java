package oop.demo02;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", 19);
        System.out.println(dog.name);
        System.out.println(dog.age);
        dog.shout();
    }
}
