import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class class2 {
    public static void main(String[] args) {
        int[] a = {2, 45, 12, 63, 6, 45, 89, 34, 65, 3, 222, 67, 1, 7, 8};
        int[] b = new int[a.length];
        int c;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[j] <a[i]) {
                    c = a[j];
                    a[j] = a[i];
                    a[i] = c;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}