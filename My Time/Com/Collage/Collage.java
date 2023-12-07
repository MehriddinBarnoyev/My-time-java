package Com.Collage;

import java.util.ArrayList;
import java.util.Collections;

public class Collage {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.sort(list);

        list.add("Salom");
        list.add("Qalesan");
        list.add("Yaxshi");
        list.add("Nima gap");

        list.remove("Yaxshi");
        Collections.sort(list);

        list.forEach(s ->{
            System.out.println(s);
        });
    }
}
