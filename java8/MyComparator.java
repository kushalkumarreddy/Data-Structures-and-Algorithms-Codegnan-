package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {

        if (i1 < i2) {
            return 1;
        } else if (i1 > i2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(10);
        al.add(15);
        al.add(76);
        al.add(83);
        al.add(12);

        System.out.println("Before sorting: " + al);

        // Without Lambda
        Collections.sort(al, new MyComparator());

        System.out.println("After sorting without Lambda: " + al);

        // With Lambda
        Comparator<Integer> c = (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;

        Collections.sort(al, c);

        System.out.println("After sorting with Lambda: " + al);
    }
}