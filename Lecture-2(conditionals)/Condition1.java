import java.util.*;
public class Condition1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>18){
        System.out.println("ADULT");
        } else { 
        System.out.println("NOT ADULT");
        }
    }
}