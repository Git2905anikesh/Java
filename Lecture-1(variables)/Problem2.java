// Make a program that takes the radius of a circle as input,
//  calculates its radius and area and prints it as output to the user.

import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius =  sc.nextFloat();
        float pi = (float) 3.14;
        float area = pi * radius * radius;
        System.out.println(area);


    }
    
}
