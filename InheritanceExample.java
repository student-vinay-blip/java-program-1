// InheritanceExample.java
class Person {
    void show() {
        System.out.println("I am a person");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I am studying");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        s.study();
    }
}
