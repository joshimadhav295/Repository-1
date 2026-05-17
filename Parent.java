package assgmnt;

abstract class Parent {

    abstract void message();
}

class FirstSubclass extends Parent {

    void message() {
        System.out.println("This is first subclass");
    }
}

class SecondSubclass extends Parent {

    void message() {
        System.out.println("This is second subclass");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {

        FirstSubclass obj1 = new FirstSubclass();
        SecondSubclass obj2 = new SecondSubclass();

        obj1.message();
        obj2.message();
    }
}