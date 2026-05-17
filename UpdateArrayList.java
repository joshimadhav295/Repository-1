package assgmnt;

import java.util.ArrayList;

public class UpdateArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Before Update: " + list);

        list.set(1, "PHP");

        System.out.println("After Update: " + list);
    }
}
