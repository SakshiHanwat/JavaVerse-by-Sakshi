class Param_Constructor{

    // data members of the class
    String name;
    int id;

    // Parameterized Constructor
    Param_Constructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    // Method to display object data
    void display(){
        
        System.out.println("GeekName: " + name
                           + " and GeekId: " + id);
    }
}
public class Parameterized_Constructor{
    // main() method — placed inside the same class for
    // universal compatibility
    public static void main(String[] args){
        
        // This will invoke the parameterized constructor
        Param_Constructor geek1 = new Param_Constructor("Sweta", 68);
        geek1.display();
    }
}