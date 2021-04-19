package me.xyp.algorithm.sort;

/**
 * Author: xyp
 * Date: 2021/4/3
 * Description:插入排序
 */
public class Insertion {
    /**
     * 时间复杂度O(n^2)
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                } else {
                    break;
                }
            }
        }

    }

    /**
     * 比较v元素是否大于w
     *
     * @param v
     * @param w
     * @return
     */
    public static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
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
