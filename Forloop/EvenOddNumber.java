package Forloop;

public class EvenOddNumber {
    public static void main(String args[]) {
        int number = 20;

        System.out.println("List of Even Number:");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }


        System.out.println("List of Odd Number:");
        for (int n = 1; n <= number; n++) {
            if (n % 2 == 1) {
                System.out.println(n + " ");
            }
        }
    }
}






















