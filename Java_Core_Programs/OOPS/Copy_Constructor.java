class Student {
    
    // Data members
    String name;
    int id;

    // Parameterized Constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    Student(Student other) {
        this.name = other.name;
        this.id = other.id;
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
        // Create first object using parameterized constructor
        System.out.println("Original Object:");
        Student student1 = new Student("Sweta", 68);
        System.out.println("Name: " + student1.name + ", ID: " + student1.id);

        System.out.println();

        // Create second object using copy constructor
        Student student2 = new Student(student1);
        System.out.println("Copied Object:");
        System.out.println("Name: " + student2.name + ", ID: " + student2.id);
    }
}
