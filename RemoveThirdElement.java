package assgmnt;

import java.util.ArrayList;

public class RemoveThirdElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("PHP");

        System.out.println("Before Removing: " + list);

        list.remove(2);

        System.out.println("After Removing Third Element: " + list);
    }
}