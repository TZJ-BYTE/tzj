public class class4 {
    public static void main(String[] args) {
        int[] a = {2, 45, 12, 63, 6, 45, 89, 34, 65, 3, 222, 67, 1, 7, 8};
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int maxIndex = -1;
            int maxValue = Integer.MIN_VALUE;


            for (int j = 0; j < a.length; j++) {
                if (a[j] > maxValue) {
                    maxValue = a[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != -1) {
                b[i] = maxValue;
                a[maxIndex] = Integer.MIN_VALUE;
            }
        }


        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}