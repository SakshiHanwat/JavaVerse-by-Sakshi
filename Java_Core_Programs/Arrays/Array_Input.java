import java.util.*;

public class Array_Input {
    public static void main(String[] args) {
        //Creation of an Array
        int marks1[] = new int[50];
        Scanner sc = new Scanner(System.in);
        
        //input an array
        marks1[0] = sc.nextInt();
        marks1[1] = sc.nextInt();
        marks1[2] = sc.nextInt();

        //output an array
        System.out.println("Physics = "+marks1[0]);
        System.out.println("Chemistry = "+marks1[1]);
        System.out.println("Maths = "+marks1[2]);

        //Update an array
        marks1[2]=100;
        System.out.println("Updated Math Marks = "+marks1[2]);

        //also we change value 
       // marks1[2] += 1;
       // System.out.println("Physics = "+marks1[2]);

       //Calculate percentage 
       int percentage = (marks1[0]+marks1[1]+marks1[2])/3;
       System.out.println("Percentage : "+percentage+"%");

       //length of an array 
       System.out.println("Length of an array : "+marks1.length);

    }
}