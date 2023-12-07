package Com.Collage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class HashSetLesson {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Salom");
        hashSet.add("Salom1");
        hashSet.add("Salom2");
        hashSet.add("Salom2");
        hashSet.add("Salom2");
        hashSet.add("Salom3");
        hashSet.add(null);

        List<String> list = new ArrayList<>();


        System.out.println(hashSet);
    }
}
