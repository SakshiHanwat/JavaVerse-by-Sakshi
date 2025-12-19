public class DefaultDemo {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.id = 101;       // ✅ default (same file/package)
        e.show();         // ✅ default
    }
}

class Employee {
    int id;          // default
    void show() {    // default
        System.out.println("Employee ID: " + id);
    }
}
