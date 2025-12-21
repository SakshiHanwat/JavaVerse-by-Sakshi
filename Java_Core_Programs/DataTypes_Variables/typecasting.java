import java.util.*;

public class typecasting {
    //narrowing conversion , explicit conversion
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float marks= sc.nextFloat();
    int marks2 = (int)marks;
    System.out.println(marks2);

        char ch = sc.next().charAt(0);
    int number = ch;
    System.out.println(number);
}
}
