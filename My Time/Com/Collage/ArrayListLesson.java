package Com.Collage;

import java.util.ArrayList;

public class ArrayListLesson {
    public static void main(String[] args) {

       ArrayList<Employer> list = new ArrayList<>();

       Employer employer = new Employer("Saleman","Asliddin",23,"450$","Canada");
       Employer employer2 = new Employer("Counter","Jaloliddin",19,"250$","Uzbekistan");
       Employer employer3 = new Employer("Cleaner","Dilnura",21,"150$","China");
       Employer employer4 = new Employer("Teacher","Sevinch",18,"450$","U.S.A");
       Employer employer5 = new Employer("Coder","Mehriddin", 25,"1450$","U.K");

       list.add(employer);
       list.add(employer2);
       list.add(employer3);
       list.add(employer4);
       list.add(employer5);

       list.forEach(employer6 -> {
           System.out.println(employer6.getPosition());
           System.out.println(employer6.getName());
           System.out.println(employer6.getAge());
           System.out.println(employer6.getSalary());
           System.out.println(employer6.getWorkPlace());
       } );







//        ArrayList<String> list1 = new ArrayList<>();
//         list1.add("Apple");
//         list1.add("Apple1");

//         ArrayList<List2> list = new ArrayList<>();
//         List2 list2 = new List2(15,"Mehriddin","Barnoyev");
//         List2 list3 = new List2(17,"Asliddin","Nuriddinov");
//         List2 list4 = new List2(10,"Ramziddin","Barnoyev");
//
//         list.add(list2);
//         list.add(list3);
//         list.add(list4);
//
//         list.forEach(item -> {
//             System.out.println(item.getId());
//             System.out.println(item.getName());
//             System.out.println(item.getLastname());
//         });
////
//


    }
}
