package cn.itcast.algorithm.sort;

import jdk.nashorn.internal.parser.JSONParser;

public class Bubble {
    public static void sort(Comparable[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
                }
            }
        }
    }

    //比较大小
    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }


    //交换元素
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
