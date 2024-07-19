public class class5 {
    public static void main(String[] args) {
        int[] a = {2, 45, 12, 63, 6, 45, 89, 34, 65, 3, 222, 67, 1, 7, 8};

        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;


            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }


        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}