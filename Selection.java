package cn.itcast.algorithm.sort;

public class Selection {

    public static void sort(Comparable[] a) {
        for (int i = 0; i <= a.length - 2; i++) {
            int minindex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (greater(a[minindex], a[j])) {
                    minindex = j;
                }
            }
            exch(a,i,minindex);
        }
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
