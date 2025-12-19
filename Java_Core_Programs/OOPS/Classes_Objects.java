public class Classes_Objects{
    public static void main(String[] args) {
        //Actusl Object Created (pen)
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
    }
}
class Pen{
    String color;
    int Tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        Tip = newTip;
    }
}
class Student{
    String student;
    int Age;
    float percentage;//cgpa

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy+chem+maths)/3;
    }
    
}