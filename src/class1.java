import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class class1 {
    public static void main(String[] args) {
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();
        int[] a = {2, 45, 12, 63, 6, 45, 89, 34, 65, 3, 222, 67, 1, 7, 8};

        for (int i = 0; i < a.length; i++) {
            int n = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[i]) {
                    n++;
                }
            }

            if (!map.containsKey(n)) {
                map.put(n, new LinkedList<>());
            }
            map.get(n).add(a[i]);
        }

        int[] b = new int[a.length];
        for (Map.Entry<Integer, LinkedList<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            LinkedList<Integer> values = entry.getValue();
            for (int value : values) {
                b[key] = value;
                key++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}