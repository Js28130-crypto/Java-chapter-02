package Chapter02.example;

import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double s = in.nextDouble();
        double area = (((3 * Math.sqrt(3)) / 2) * Math.pow(s, 2));
        System.out.println("The area of the hexagon is: " + area);
    }
}
