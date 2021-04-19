package me.xyp.algorithm.sort;

/**
 * Author: xyp
 * Date: 2021/4/3
 * Description:选择排序
 */
public class Selection {

    /**
     * 时间复杂度O(n^2)
     * @param a
     */
    public static void sort(Comparable[] a) {
        int length = a.length;
        int minIndex;
        for (int i = 0; i < length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < length; j++) {
                if (greater(a[minIndex], a[j])) {
                    minIndex = j;
                }
            }
            if (i != minIndex)
                exch(a, i, minIndex);
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
