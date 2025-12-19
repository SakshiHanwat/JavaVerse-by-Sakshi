public class Setter_Getter {
    public static void main(String[] args) {

        // Pen object create kiya
        Pen p1 = new Pen();

        // Setter use karke value set kar rahe hain
        p1.setTip(5);          // tip set kar diya
        p1.setColor("Blue");   // color set kar diya

        // Getter use karke value print kar rahe hain
        System.out.println("Tip of Pen: " + p1.getTip());
        System.out.println("Color of Pen: " + p1.getColor());
    }
}

// Pen class with encapsulated fields
class Pen {
    private String color;  // private field
    private int tip;       // private field

    // Getter for color
    String getColor() {
        return this.color;
    }

    // Getter for tip
    int getTip() {
        return this.tip;
    }

    // Setter for color
    void setColor(String newColor) {
        this.color = newColor;
    }

    // Setter for tip
    void setTip(int tip) {
        this.tip = tip;
    }
}
