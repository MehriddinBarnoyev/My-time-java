package Com.Collage;

import java.util.Scanner;

public class Exampla23 {
    public static void main(String[] args) {


        int[] array1 = {2, 5, 3, 8, 6};


        int secondLargest1 = findSecondLargest(array1);

        System.out.println("Test case 1: " + secondLargest1);

    }

    static int findSecondLargest(int[] arr) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }

        return secondLargest;





//        int i = 0;
//        if (i <5) {
//            System.out.print(i + "");
//            i++;
//        }
//



//        int x = 10;
//        if(x <= 10) {
//            System.out.println("A");
//        } if(x >= 10) {
//            System.out.println("B");
//        } if(x == 10) {
//            System.out.println("C");
//        }



//        int x = 1;
//        if(x == 1) {
//            System.out.println("A");
//            if(x < 2) {System.out.println("B");
//            }
//        } else{
//            System.out.println("C");
//        }

//        int x = 10;
//        int y = 5;
//        int z = 15;
//        int natijasi = (x > y) ? ((z > x) ? z : x) : y;
//        System.out.println(natijasi);









//        int x = 10;
//        if(x > 5) {
//            System.out.println("A");
//            if(x < 15) {
//                System.out.println("B");
//            } else{
//                System.out.println("C");
//            }
//        } else  {
//            System.out.println("D");
//        }







//        int x = 10;
//        if(x <= 10) {
//            System.out.println("A");
//        } if(x >= 10) {
//            System.out.println("B");
//        } if(x == 10) {
//            System.out.println("C");
//        }



//        int x = 10; int y = 5;
//        int natijasi = (x > y) ? x : y;
//        System.out.println(natijasi);



//
//        Scanner scanner = new Scanner(System.in);
//        int s = scanner.nextInt();
//
//       out: for (int i = 2; i <= s; i++) {
//            for (int j = 2; j <=i-1 ; j++) {
//                if(i % j ==0){
//                    continue out;
//                }
//            }
//           System.out.println(i);
//
//        }




//      out:  for (int i = 0; i < s; i++) {
//            for (int j = 0; j <10; j++) {
//                if(i == 4){
//                    continue out;
//                }
//                System.out.println(i);
//            }
//        }







//     int n = 15;
//     int m = 15;
//
//        System.out.println(n++ + ++n );
//        System.out.println(m++ + m++);









//        int a = 10;
//        int b = 3;
//        int s = a % b;
//        System.out.println(s);










//        Scanner scanner = new Scanner(System.in);
//        int day = scanner.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Dushanba");
//                break;
//            case 2:
//                System.out.println("Seshanba");
//                break;
//            case 3:
//                System.out.println("Chorshanba");
//                break;
//            case 4:
//                System.out.println("Payshanba");
//                break;
//            case 5:
//                System.out.println("Juma");
//                break;
//            case 6:
//                System.out.println("Shanba");
//                break;
//            case 7:
//                System.out.println("Yakshanba");
//                break;
//            default:
//                System.out.println("Xato");
//                break;
//        }





//
//        int a= scanner.nextInt();
//
//        if(a > 0  && a < 50 ){
//            for (int i = 0; i < a; i++) {
//
//                System.out.println(i);
//            }
//        }else{
//            System.out.println("Noto'g'ri son kiritildi");
//        }








//
//        int x = 1;
//        int y = ++x;
//        System.out.println(x);
//        System.out.println(y);






//        int x = 2;
//        x = x++ + x++;
//        System.out.println(x);
//        double x = 10/4;
//        System.out.println(x);
//        int a,b;
//        b = 2;
//        a = ++b;
//        System.out.println(a);




//        int x = 1;
//        int y = ++x;
//
//        System.out.println(y);
//        System.out.println(x);






//        char s = 156;
//        System.out.println(s);














//        int s = 10;
//        double y = 2.5;
//        double z = s +y;
//
//        System.out.println(z);
//        String s = "Java String Quiz";
//        System.out.println(s.charAt(s.toUpperCase().length()));

//        String s1 = "Mushuk";
//        String s2 = "Mushuk";
//        String s3 = new String("Mushuk");
//        System.out.print(s1 == s2);
//        System.out.print(s1 == s3);
//        String s1 = "abc";
//        String s2 = "def";
//        System.out.println(s1.compareTo(s2));


    }
}
