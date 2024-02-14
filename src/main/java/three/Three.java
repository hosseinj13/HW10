package three;

import java.util.ArrayList;
import java.util.List;

public class Three {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(7);
        list.add(3);
        list.add(1);

        removeImproperPairs(list);

        System.out.println(list);
    }

    public static void removeImproperPairs(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            if (list.get(i) > list.get(i + 1)) {
                list.remove(i);
                list.remove(i);
                i -= 2;
            }
        }

        if (list.size() % 2 == 1) {
            list.remove(list.size() - 1);
        }
    }
}
