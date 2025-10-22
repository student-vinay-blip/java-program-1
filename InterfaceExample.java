// InterfaceExample.java
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}
