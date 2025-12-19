class SuperParent {
    int x = 10;
    void display() {
        System.out.println("Parent x = " + x);
    }
}

class SuperChild extends SuperParent {
    int x = 20;
    void display() {
        System.out.println("Child x = " + x);
        System.out.println("Parent x using super = " + super.x);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        SuperChild obj = new SuperChild();
        obj.display();
    }
}
