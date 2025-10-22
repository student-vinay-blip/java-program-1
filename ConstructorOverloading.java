// ConstructorOverloading.java
class Rectangle {
    int length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area: " + (length * breadth));
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);

        r1.area();
        r2.area();
    }
}
