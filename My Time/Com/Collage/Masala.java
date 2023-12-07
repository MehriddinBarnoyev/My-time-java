package Com.Collage;

import java.util.Scanner;

public class Masala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        int s1 = s % 10;
        int s2 = (s / 10) % 10;
        int s3 = s / 100;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
