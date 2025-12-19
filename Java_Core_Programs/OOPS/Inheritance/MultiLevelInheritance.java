class MultiLevelGrandParent {
    void greet() {
        System.out.println("Grandparent method");
    }
}

class MultiLevelParent extends MultiLevelGrandParent {
    void greetParent() {
        System.out.println("Parent method");
    }
}

class MultiLevelChild extends MultiLevelParent {
    void greetChild() {
        System.out.println("Child method");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        MultiLevelChild obj = new MultiLevelChild();
        obj.greet();
        obj.greetParent();
        obj.greetChild();
    }
}
