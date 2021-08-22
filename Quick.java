//package cn.itcast.algorithm.sort;
//
//public class Quick {
//    public static void sort(Comparable[] a) {
//        int low = 0;
//        int high = a.length - 1;
//        sort(a, low, high);
//    }
//
//    private static void sort(Comparable[] a, int low, int high) {
//        //防御性编程
//        if (low >= high) {
//            return;
//        }
//
//        //需要对数组中low的索引到high处的元素进行分组
//        int partition = partition(a, low, high);
//        //让左子组有序
//        sort(a, low, partition - 1);
//        //让右自组有序
//        sort(a, partition+1, high);
//
//        private static boolean less(Comparable v, Comparable w){
//            return v.compareTo(w) < 0;
//        }
//
//        private static void exch (Comparable[]a,int i, int j){
//            Comparable temp = a[i];
//            a[i] = a[j];
//            a[j] = temp;
//        }
//
//        private static int partition (Comparable[]a,int low, int high){
//            return -1;
//        }
//
//    }
