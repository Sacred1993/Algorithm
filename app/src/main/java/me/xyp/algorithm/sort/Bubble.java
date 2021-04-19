package me.xyp.algorithm.sort;

/**
 * Author: xyp
 * Date: 2021/4/3
 * Description:冒泡排序
 */
public class Bubble {

    /**
     * 时间复杂度O(n^2)
     * @param a
     */
    public static void sort(Comparable[] a) {
        int length = a.length;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (greater(a[j], a[j + 1])) {
                    exch(a, j, j + 1);
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
