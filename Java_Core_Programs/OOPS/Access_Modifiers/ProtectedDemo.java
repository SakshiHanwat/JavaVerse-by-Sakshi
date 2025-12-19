public class ProtectedDemo {
    public static void main(String[] args) {

        Car c = new Car();
        c.model = "BMW";    // ✅ protected (same package/file)
        c.showModel();     // ✅ protected
    }
}

class Car {
    protected String model;

    protected void showModel() {
        System.out.println("Car Model: " + model);
    }
}
