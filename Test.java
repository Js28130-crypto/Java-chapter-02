package Chapter02.example;

public class Test {
    public static void main(String[] args) {
        double miles = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;
        System.out.println("Kilometers: " + kilometers);
    }
}
