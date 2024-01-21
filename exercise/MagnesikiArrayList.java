package exercise;

import java.util.ArrayList;

public class MagnesikiArrayList {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add(0, "zero");
        a.add(1, "jeden");
        a.add(2, "dwa");
        a.add(3, "trzy");
        printList(a);

        if (a.contains("trzy")) {
            a.add("cztery");

        }
        a.remove(2);
        printList(a);

        if (a.indexOf("cztery") != 4)   {
            a.add(4, "4.2");
        }
        printList(a);

        if (a.contains("dwa"))  {
            a.add("2.2");
        }
        printList(a);
    }

    public static void printList(ArrayList<String> list) {
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

