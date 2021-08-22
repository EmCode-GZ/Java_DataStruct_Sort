package cn.itcast.algorithm.sort;

public class Merge {
    private static Comparable[] assist;

    public static void sort(Comparable[] a) {
        //1.初始化辅助数组assist
        assist = new Comparable[a.length];
        //2.定义数组中最小索引low，最大索引high
        int low = 0;
        int high = a.length - 1;
        //3.调用sort重载方法，对数组a的low到high的元素的排序
        sort(a, low, high);
    }

    //sort重载方法
    private static void sort(Comparable[] a, int low, int high) {
        //防御性编程
        if (high <= low) {
            return;
        }
        //对low到high之间的数据进行分组
        int mid = low + (high - low) / 2;
        //分别对每一组数据排序
        sort(a, mid + 1, high);
        sort(a, low, mid);
        //再把两个组中的数据归并
        merge(a, low, mid, high);
    }

    //核心代码
    private static void merge(Comparable[] a, int low, int mid, int high) {
        //定义三个指针
        int i = low;
        int p1 = low;
        int p2 = mid + 1;
        //遍历，移动p1指针和p2指针，比较对应索引处的值，找出较小位，放到辅助数组处
        while (p1 <= mid && p2 <= high) {
            //比较对应索引处的值
            if (less(a[p1], a[p2])) {
                assist[i++] = a[p1++];
            } else {
                assist[i++] = a[p2++];
            }

        }
        //遍历，如果p1的指针没有走完，那么顺序移动p1指针，把对应的元素放到辅助数组
        while (p1 <= mid) {
            assist[i++] = a[p1++];
        }
        //遍历，如果p2的指针没有走完，那么顺序移动p1指针，把对应的元素放到辅助数组
        while (p2 <= high) {
            assist[i++] = a[p2++];
        }
        //把辅助数组的元素复制到原数组中
        for (int index = low; index <= high; index++) {
            a[index] = assist[index];
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
