package day25_CustomMethod_Overloading;

public class MinNumber_Overloading {

    public static void main(String[] args) {



    int a[] = {10, 4, 58, 63, 24, 74, 2};
        System.out.println(min(a));

    double h[] = {10.5, 4, 58.6, 63, 24.4, 74, 2.2};
        System.out.println(min(h));

    long b[] = {108, 4000, 5832, 63, 24, 7400, 200000};
        System.out.println(min(b));

    float j[] = {1.5F, 4, (float) 58.6, 63, (float) 24.4, 74, (float) 2.2};
        System.out.println(min(j));
}

    public static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static double min(double[] a) {
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static long min(long[] a) {
        long min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static float min(float[] a) {
        float min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }
}
