class HierarchicalParent {
    void parentMethod() {
        System.out.println("Parent Method");
    }
}

class HierChild1 extends HierarchicalParent {
    void child1Method() {
        System.out.println("Child1 Method");
    }
}

class HierChild2 extends HierarchicalParent {
    void child2Method() {
        System.out.println("Child2 Method");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        HierChild1 c1 = new HierChild1();
        c1.parentMethod();
        c1.child1Method();

        HierChild2 c2 = new HierChild2();
        c2.parentMethod();
        c2.child2Method();
    }
}
