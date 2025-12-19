public class PublicDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Sakshi";   // ✅ public
        s.display();         // ✅ public
    }
}

class Student {
    public String name;

    public void display() {
        System.out.println("Name: " + name);
    }
}
