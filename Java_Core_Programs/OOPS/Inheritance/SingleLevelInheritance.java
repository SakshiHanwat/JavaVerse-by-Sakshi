class SingleLevelParent {
    void display() {
        System.out.println("Single Level Parent class method");
    }
}

class SingleLevelChild extends SingleLevelParent {
    void show() {
        System.out.println("Single Level Child class method");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        SingleLevelChild obj = new SingleLevelChild();
        obj.display();
        obj.show();
    }
}
