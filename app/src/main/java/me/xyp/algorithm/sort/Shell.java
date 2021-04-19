package me.xyp.algorithm.sort;

/**
 * Author: xyp
 * Date: 2021/4/3
 * Description:希尔排序
 */
public class Shell {

    /**
     * 时间复杂度O(n^2)
     *
     * @param a
     */
    public static void sort(Comparable[] a) {
        int length = a.length;
        int h = 1;
        while (h < length/2) {
            h = 2 * h + 1;
        }

        int groupCount;
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h; j = j - h) {
                    if (greater(a[j - h], a[j])) {
                        exch(a, j - h, j);
                    } else {
                        break;
                    }
                }
            }
            h = h / 2;
        }
    }

    /**
     * 自己想的非完美实现逻辑
     *
     * @param a
     */
    public static void sort2(Comparable[] a) {
        int length = a.length;
        int h = 1;
        while (h < length/2) {
            h = 2 * h + 1;
        }

        int groupCount;
        while (h >= 1) {
            groupCount = h;
            for (int g = 0; g < groupCount; g++) {
                for (int i = h; i < length; i = i + h) {
                    for (int j = i; j >= h; j = j - h) {
                        if (greater(a[j - h], a[j])) {
                            exch(a, j - h, j);
                        } else {
                            break;
                        }
                    }
                }
            }
            h = h / 2;
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
