package me.xyp.algorithm.sort;

/**
 * Author: xyp
 * Date: 2021/4/10
 * Description:
 */
public class Quick {
    /**
     * 时间复杂度O(nlogn)
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo)
            return;

        int mid = partition(a, lo, hi);
        sort(a, lo, mid - 1);
        sort(a, mid + 1, hi);
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        Comparable key = a[lo];
        int left = lo;
        int right = hi + 1;

        while (true) {
            while (less(a[++left], key)) {
                if (left == hi)
                    break;
            }
            while (less(key, a[--right])) {
                if (right == lo)
                    break;
            }
            if (left >= right) {
                break;
            } else {
                exch(a, left, right);
            }
        }
        exch(a, right, lo);
        return right;
    }


    /**
     * 比较v元素是否大于w
     *
     * @param v
     * @param w
     * @return
     */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换位置
     *
     * @param a
     * @param i
     * @param j
     */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
