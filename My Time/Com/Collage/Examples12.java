package Com.Collage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.LocalDate;
import java.time.Period;


import java.util.Arrays;

public class Examples12 {
    public static void main(String[] args){

        // 10 - vazifa
//        LocalDate birthDate = LocalDate.of(2004, 8, 6);
//
//        LocalDate currentDate = LocalDate.of(2023, 12, 12);
//
//        Period age = calculateAge(birthDate, currentDate);
//
//        System.out.println("Tug'ilgan sana: " + birthDate);
//        System.out.println("Joriy sana: " + currentDate);
//        System.out.println("Yosh: " + age.getYears() + " yil " + age.getMonths() + " oy " + age.getDays() + " kun");
//    }
//
//    public static Period calculateAge(LocalDate birthDate, LocalDate currentDate) {
//        return Period.between(birthDate, currentDate);
//
//









        // 9 - vazifa

//        double length = 5.0;
//        double width = 10.0;
//
//
//        double area = calculateRectangleArea(length, width);
//
//        System.out.println("Uzunlik = " + length + ", Kenglik = " + width + " Maydon = " + area);
//    }
//
//    public static double calculateRectangleArea(double length, double width) {
//        return length * width;








        // 8 - vazifa
//        double fahrenheit = 32.0;
//
//        double celsius = convertToFahrenheitToCelsius(fahrenheit);
//
//        System.out.println("Farengeyt = " + fahrenheit + " Selsiy = " + celsius);
//    }
//    public static double convertToFahrenheitToCelsius(double fahrenheit) {
//        return (fahrenheit - 32) * 5 / 9;












        // 7 - vazifa
//        String password = "Abcd123%";
//
//        boolean isValid = checkPassword(password);
//
//        System.out.println("Natija: " + isValid);
//    }
//
//    public static boolean checkPassword(String password) {
//        boolean hasUpperCase = false;
//        boolean hasLowerCase = false;
//        boolean hasDigit = false;
//        boolean hasSpecialChar = false;
//
//        String specialChars = "@#$%";
//
//        for (char ch : password.toCharArray()) {
//            if (Character.isUpperCase(ch)) {
//                hasUpperCase = true;
//            } else if (Character.isLowerCase(ch)) {
//                hasLowerCase = true;
//            } else if (Character.isDigit(ch)) {
//                hasDigit = true;
//            } else if (specialChars.indexOf(ch) != -1) {
//                hasSpecialChar = true;
//            }
//        }
//
//        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
//






        // 6 - vazifa

//        boolean a = true;
//        boolean b = false;
//
//        boolean resultAnd = a && b;
//        boolean resultOr = a || b;
//
//        System.out.println("a and b = " + resultAnd);
//        System.out.println("a or b = " + resultOr);











        // 5 - vazifa
//        int[] numbers = {2, 5, 3, 8, 6};
//
//        Pair result = findMinMax(numbers);
//
//        System.out.println("Output: (" + result.getMin() + ", " + result.getMax() + ")");
//    }
//
//    static class Pair {
//        private final int min;
//        private final int max;
//
//        public Pair(int min, int max) {
//            this.min = min;
//            this.max = max;
//        }
//
//        public int getMin() {
//            return min;
//        }
//
//        public int getMax() {
//            return max;
//        }
//    }
//
//    public static Pair findMinMax(int[] arr) {
//        if (arr.length == 0) {
//            return new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE);
//        }
//
//        int min = arr[0];
//        int max = arr[0];
//
//        for (int num : arr) {
//            if (num < min) {
//                min = num;
//            } else if (num > max) {
//                max = num;
//            }
//        }
//
//        return new Pair(min, max);
//








        // 4 - vazifa
//        int[] numbers = {2, 5, 3, 5, 8, 6};
//
//        List<Integer> duplicates = findDuplicates(numbers);
//
//        System.out.println("Output: " + duplicates);
//    }
//
//    public static List<Integer> findDuplicates(int[] arr) {
//        List<Integer> result = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();
//
//        for (int num : arr) {
//            if (!set.add(num)) {
//                result.add(num);
//            }
//        }
//
//        return result;











        // 3 - vazifa
//        int[] numbers = {2, 5, 6, 8, 9};
//
//        boolean isSorted = checkSorted(numbers);
//
//
//        System.out.println("Output: " + isSorted);
//    }
//    public static boolean checkSorted(int[] arr) {
//        int[] copy = Arrays.copyOf(arr, arr.length);
//
//        Arrays.sort(copy);
//
//        return Arrays.equals(arr, copy);











        // 2 - vazifa
//
//        int[] numbers = {2, 5, 3, 8, 6};
//
//        int result = findSum(numbers);
//
//        System.out.println("Output: " + result);
//    }
//
//
//    public static int findSum(int[] arr) {
//        int sum = 0;
//
//        for (int num : arr) {
//            sum += num;
//        }
//
//        return sum;
//
//












      // 1- topshiriq

        //        int[] array1 = {2, 5, 3, 8, 6};
//
//
//        int secondLargest1 = findSecondLargest(array1);
//
//        System.out.println("Test case 1: " + secondLargest1);
//
//    }
//
//    static int findSecondLargest(int[] arr) {
//        int firstLargest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int num : arr) {
//            if (num > firstLargest) {
//                secondLargest = firstLargest;
//                firstLargest = num;
//            } else if (num > secondLargest && num != firstLargest) {
//                secondLargest = num;
//            }
//        }
//
//        return secondLargest;

    }
}
